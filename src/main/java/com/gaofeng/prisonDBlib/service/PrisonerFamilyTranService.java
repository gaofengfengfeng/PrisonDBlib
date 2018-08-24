package com.gaofeng.prisonDBlib.service;

import com.didi.meta.javalib.Conversion;
import com.didi.meta.javalib.IdUtil;
import com.didi.meta.javalib.JLog;
import com.gaofeng.prisonDBlib.beans.PrisonerFamilyRegisterReq;
import com.gaofeng.prisonDBlib.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: gaofeng
 * @Date: 2018-08-24
 * @Description: 犯属相关的事务方法类
 */
@Service
public class PrisonerFamilyTranService {

    private PrisonerFamilyMapper pfm;
    private PrisonerFamilyRelationshipMapper pfrm;
    private PrisonerFamilyMaterialMapper pfmm;

    @Autowired
    public PrisonerFamilyTranService(PrisonerFamilyMapper prisonerFamilyMapper,
                                     PrisonerFamilyRelationshipMapper prisonerFamilyRelationshipMapper,
                                     PrisonerFamilyMaterialMapper prisonerFamilyMaterialMapper) {
        this.pfm = prisonerFamilyMapper;
        this.pfrm = prisonerFamilyRelationshipMapper;
        this.pfmm = prisonerFamilyMaterialMapper;
    }


    /**
     * 犯属注册，其中犯属个人信息、犯人犯属关系以及犯属资料的存储放在一个事务里进行，如果有一个操作失败，则事务回滚
     *
     * @param pfrr
     *
     * @return 1：成功 2：用户名已被使用 3：已经注册过 4：数据库错误
     */
    @Transactional
    public Integer prisonerFamilyRegister(PrisonerFamilyRegisterReq pfrr) {
        JLog.info("prisonerFamily register service username=" + pfrr.getUsername());

        // 查看该用户名是否已经被使用
        PrisonerFamily pfInDB = pfm.findByUsername(pfrr.getUsername());
        if (pfInDB != null) {
            JLog.warn("username already exists usernmae=" + pfrr.getUsername());
            return 2;
        }

        // 查看该身份证号或者手机号是否被注册过
        PrisonerFamily pfInDB2 = pfm.findByIdCardNoOrPhone(pfrr.getIdCardNo(),
                pfrr.getPhone());
        if (pfInDB2 != null) {
            JLog.warn("prisonerFamily have registered idCardNo=" + pfrr.getIdCardNo() + " " +
                    "phone=" + pfrr.getPhone());
            return 3;
        }

        // 构造犯属对象，准备入库
        PrisonerFamily pf = new PrisonerFamily();
        Long prisonerFamilyId = IdUtil.generateLongId();
        pf.setPrisonerFamilyId(prisonerFamilyId);
        pf.setUsername(pfrr.getUsername());
        String salt = IdUtil.createSalt();
        pf.setPassword(Conversion.getMD5(pfrr.getPassword() + salt));
        pf.setSalt(salt);
        pf.setPrisonerFamilyName(pfrr.getPrisonerFamilyName());
        pf.setIdCardNo(pfrr.getIdCardNo());
        pf.setGender(pfrr.getGender());
        pf.setPhone(pfrr.getPhone());
        pf.setHomeAddress(pfrr.getHomeAddress());
        pf.setEducationDegree(pfrr.getEducationDegree());
        pf.setRoleId(Role.Type.PRISONER_FAMILY);

        // 入库
        Integer saveRet = pfm.save(pf);
        if (!saveRet.equals(1)) {
            JLog.error("save prisonerFamily failed username=" + pfrr.getUsername(),
                    103231546);
            // 事务回滚
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return 4;
        }

        // 建立和犯人的关系
        PrisonerFamilyRelationship pfr = new PrisonerFamilyRelationship();
        pfr.setRelationshipId(IdUtil.generateLongId());
        pfr.setPrisonerId(pfrr.getPrisonerId());
        pfr.setPrisonerFamilyId(prisonerFamilyId);
        pfr.setRelationship(pfrr.getRelationship());

        Integer saveRet1 = pfrm.save(pfr);
        if (!saveRet1.equals(1)) {
            JLog.error("save prisonerFamilyRelationship failed username=" + pfrr.getUsername(),
                    103242123);
            // 事务回滚
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return 4;
        }

        // 建立个人资料的存储记录
        List<PrisonerFamilyMaterial> prisonerFamilyMaterialList = new ArrayList<>();
        for (PrisonerFamilyRegisterReq.Material material : pfrr.getPersonalMaterialList()) {
            PrisonerFamilyMaterial pfm = new PrisonerFamilyMaterial();
            pfm.setMaterialId(IdUtil.generateLongId());
            pfm.setPrisonerFamilyId(prisonerFamilyId);
            pfm.setMaterialType(material.getType());
            pfm.setMaterialUrl(material.getUrl());
            prisonerFamilyMaterialList.add(pfm);
        }

        // 批量存储犯属资料信息
        Integer saveRet2 = pfmm.batchSave(prisonerFamilyMaterialList);
        if (!saveRet2.equals(prisonerFamilyMaterialList.size())) {
            JLog.error("batch save prisonerFamilyMaterial failed username=" + pfrr.getUsername(),
                    103242130);
            // 事务回滚
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return 4;
        }

        return 1;
    }
}
