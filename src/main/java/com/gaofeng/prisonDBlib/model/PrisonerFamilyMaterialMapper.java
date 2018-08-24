package com.gaofeng.prisonDBlib.model;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: gaofeng
 * @Date: 2018-08-24
 * @Description:
 */
@Component
@Mapper
public interface PrisonerFamilyMaterialMapper {

    @Insert({"<script>" +
            " INSERT INTO prisoner_family_material(materialId, prisonerFamilyId, materialType, " +
            "materialUrl, createTime) VALUES " +
            "<foreach item='prisonerFamilyMaterial' collection='prisonerFamilyMaterialList' " +
            "index='index' separator =','>" +
            "(#{prisonerFamilyMaterial.materialId}, #{prisonerFamilyMaterial.prisonerFamilyId}, " +
            "#{prisonerFamilyMaterial.materialType}, #{prisonerFamilyMaterial.materialUrl}, " +
            "#{prisonerFamilyMaterial.createTime}) " +
            "</foreach>" +
            "</script>"})
    Integer batchSave(@Param("prisonerFamilyMaterialList") List<PrisonerFamilyMaterial> prisonerFamilyMaterialList);

}
