package com.gaofeng.prisonDBlib.model;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @Author: gaofeng
 * @Date: 2018-08-23
 * @Description:
 */
@Component
@Mapper
public interface PrisonerFamilyMapper {

    @Select("SELECT * FROM prisoner_family WHERE username=#{username}")
    PrisonerFamily findByUsername(String username);

    @Select("SELECT * FROM prisoner_family WHERE idCardNo=#{0} OR phone=#{1}")
    PrisonerFamily findByIdCardNoOrPhone(String idCardNo, String phone);

    @Insert("INSERT INTO prisoner_family(prisonerFamilyId, username, password, salt, portraitUrl," +
            " prisonerFamilyName, idCardNo, gender, phone, homeAddress, educationDegree, roleId, " +
            "createTime) values(#{prisonerFamilyId}, #{username}, #{password}, #{salt}, " +
            "#{portraitUrl}, #{prisonerFamilyName}, #{idCardNo}, #{gender}, #{phone}, " +
            "#{homeAddress}, #{educationDegree}, #{roleId}, #{createTime})")
    Integer save(PrisonerFamily prisonerFamily);
}
