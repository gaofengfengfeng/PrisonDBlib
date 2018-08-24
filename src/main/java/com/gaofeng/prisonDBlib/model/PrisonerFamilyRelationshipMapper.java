package com.gaofeng.prisonDBlib.model;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @Author: gaofeng
 * @Date: 2018-08-24
 * @Description:
 */
@Component
@Mapper
public interface PrisonerFamilyRelationshipMapper {

    @Insert("INSERT INTO prisoner_family_relationship(prisonerId, relationshipId, prisonerFamilyId, relationship," +
            " createTime) VALUES(#{prisonerId}, #{relationshipId}, #{prisonerFamilyId}, #{relationship}, " +
            "#{createTime})")
    Integer save(PrisonerFamilyRelationship prisonerFamilyRelationship);
}
