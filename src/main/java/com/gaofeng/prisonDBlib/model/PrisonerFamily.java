package com.gaofeng.prisonDBlib.model;

/**
 * @Author: gaofeng
 * @Date: 2018-08-23
 * @Description:
 */
public class PrisonerFamily {
    private Long id;
    private Long prisonerFamilyId;
    private String username;
    private String password;
    private String salt;
    private String portraitUrl;
    private String prisonerFamilyName;
    private String idCardNo;
    private Integer gender;
    private String phone;
    private String homeAddress;
    private String educationDegree;
    private Integer roleId;
    private Long createTime;
    private Long updateTime;

    public PrisonerFamily() {
        id = null;
        prisonerFamilyId = 0L;
        username = "";
        password = "";
        salt = "";
        portraitUrl = "";
        prisonerFamilyName = "";
        idCardNo = "";
        gender = 0;
        phone = "";
        homeAddress = "";
        educationDegree = "";
        roleId = 0;
        createTime = System.currentTimeMillis();
        updateTime = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrisonerFamilyId() {
        return prisonerFamilyId;
    }

    public void setPrisonerFamilyId(Long prisonerFamilyId) {
        this.prisonerFamilyId = prisonerFamilyId;
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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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
}
