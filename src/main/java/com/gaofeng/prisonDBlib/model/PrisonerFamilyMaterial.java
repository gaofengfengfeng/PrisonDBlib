package com.gaofeng.prisonDBlib.model;

import org.springframework.web.accept.MappingMediaTypeFileExtensionResolver;

/**
 * @Author: gaofeng
 * @Date: 2018-08-24
 * @Description:
 */
public class PrisonerFamilyMaterial {
    private Long id;
    private Long materialId;
    private Long prisonerFamilyId;
    private Integer materialType; // 资料类型 0：未使用 1：照片 2：录音
    private String materialUrl;
    private Long createTime;
    private Long updateTime;

    public PrisonerFamilyMaterial() {
        id = null;
        materialId = 0L;
        prisonerFamilyId = 0L;
        materialType = 0;
        materialUrl = "";
        createTime = System.currentTimeMillis();
        updateTime = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public Long getPrisonerFamilyId() {
        return prisonerFamilyId;
    }

    public void setPrisonerFamilyId(Long prisonerFamilyId) {
        this.prisonerFamilyId = prisonerFamilyId;
    }

    public Integer getMaterialType() {
        return materialType;
    }

    public void setMaterialType(Integer materialType) {
        this.materialType = materialType;
    }

    public String getMaterialUrl() {
        return materialUrl;
    }

    public void setMaterialUrl(String materialUrl) {
        this.materialUrl = materialUrl;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "PrisonerFamilyMaterial{" +
                "id=" + id +
                ", materialId=" + materialId +
                ", prisonerFamilyId=" + prisonerFamilyId +
                ", materialType=" + materialType +
                ", materialUrl='" + materialUrl + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
