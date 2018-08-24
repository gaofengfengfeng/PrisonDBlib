package com.gaofeng.prisonDBlib.model;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: gaofeng
 * @Date: 2018-08-21
 * @Description:
 */
@Component
@Mapper
public interface PrisonerMapper {

    /**
     * 犯人信息入库
     *
     * @param prisoner
     *
     * @return
     */
    @Insert("INSERT INTO prisoner(prisonerId, prisonerCodeNum, password, salt, portraitUrl, " +
            "prisonAddress, prisonArea, criminalType, prisonTerm, prisonerName, idCardNo, gender," +
            " age, birthDate, homeAddress, roleId, score, privilegeLevel, beginTime, " +
            "registerTime, createTime) values (#{prisonerId}, #{prisonerCodeNum}, #{password}, " +
            "#{salt}, #{portraitUrl}, #{prisonAddress}, #{prisonArea}, #{criminalType}, " +
            "#{prisonTerm}, #{prisonerName}, #{idCardNo}, #{gender}, #{age}, #{birthDate}, " +
            "#{homeAddress}, #{roleId}, #{score}, #{privilegeLevel}, #{beginTime}, " +
            "#{registerTime}, #{createTime})")
    Integer savePrisoner(Prisoner prisoner);

    @Select("SELECT * FROM prisoner WHERE prisonerCodeNum=#{prisonerCodeNum}")
    Prisoner findByPrisonerCodeNum(String prisonerCodeNum);

    @Select("SELECT * FROM prisoner WHERE prisonerName=#{prisonerName}")
    List<Prisoner> findByPrisonerName(String prisonerName);
}
