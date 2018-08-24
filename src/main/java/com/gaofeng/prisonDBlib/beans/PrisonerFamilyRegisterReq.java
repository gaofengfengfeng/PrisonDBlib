package com.gaofeng.prisonDBlib.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: gaofeng
 * @Date: 2018-08-24
 * @Description:
 */
public class PrisonerFamilyRegisterReq {

    private String username;
    private String password;
    private String prisonerFamilyName;
    private String idCardNo;
    private Integer gender; // 性别 0：未使用 1：男 2：女
    private String phone;
    private String homeAddress;
    private String educationDegree; // 教育程度
    private Long prisonerId;
    private String relationship;
    private List<Material> personalMaterialList = new ArrayList<>();

    public static class Material {
        private Integer type; // 0：未使用 1：照片 2：录音
        private String url;

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public String toString() {
            return "Material{" +
                    "type=" + type +
                    ", url='" + url + '\'' +
                    '}';
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrisonerFamilyName() {
        return prisonerFamilyName;
    }

    public void setPrisonerFamilyName(String prisonerFamilyName) {
        this.prisonerFamilyName = prisonerFamilyName;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Long getPrisonerId() {
        return prisonerId;
    }

    public void setPrisonerId(Long prisonerId) {
        this.prisonerId = prisonerId;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public List<Material> getPersonalMaterialList() {
        return personalMaterialList;
    }

    public void setPersonalMaterialList(List<Material> personalMaterialList) {
        this.personalMaterialList = personalMaterialList;
    }

    @Override
    public String toString() {
        return "PrisonerFamilyRegisterReq{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", prisonerFamilyName='" + prisonerFamilyName + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", educationDegree='" + educationDegree + '\'' +
                ", prisonerId=" + prisonerId +
                ", relationship='" + relationship + '\'' +
                ", personalMaterialList=" + personalMaterialList +
                '}';
    }
}
