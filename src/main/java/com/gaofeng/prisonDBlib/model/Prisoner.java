package com.gaofeng.prisonDBlib.model;

/**
 * @Author: gaofeng
 * @Date: 2018-08-21
 * @Description:
 */
public class Prisoner {

    private Long id;
    private Long prisonerId;

    private String prisonerCodeNum; // 狱政编号
    private String password;
    private String salt;
    private String portraitUrl;

    private String prisonAddress; // 监狱地址
    private String prisonArea; // 监区
    private Integer criminalType; // 犯罪类型
    private String prisonTerm; // 刑期

    private String prisonerName;
    private String idCardNo;
    private Integer gender; // 性别 0：未使用 1：男 2：女
    private Integer age;
    private String birthDate;
    private String homeAddress;

    private Integer roleId;
    private Integer score; // 阳光积分
    private Integer privilegeLevel; // 权限等级

    private Long beginTime; // 入狱时间
    private Long registerTime;
    private Long createTime;
    private Long updateTime;

    public Prisoner() {
        id = null;
        prisonerId = 0L;
        prisonerCodeNum = "";
        password = "";
        salt = "";
        portraitUrl = "";
        prisonAddress = "";
        prisonArea = "";
        criminalType = 0;
        prisonTerm = "";
        prisonerName = "";
        idCardNo = "";
        gender = 0;
        age = 0;
        birthDate = "";
        homeAddress = "";
        roleId = 0;
        score = 0;
        privilegeLevel = 0;
        beginTime = 0L;
        registerTime = 0L;
        createTime = System.currentTimeMillis();
        updateTime = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrisonerId() {
        return prisonerId;
    }

    public void setPrisonerId(Long prisonerId) {
        this.prisonerId = prisonerId;
    }

    public String getPrisonerCodeNum() {
        return prisonerCodeNum;
    }

    public void setPrisonerCodeNum(String prisonerCodeNum) {
        this.prisonerCodeNum = prisonerCodeNum;
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

    public String getPrisonAddress() {
        return prisonAddress;
    }

    public void setPrisonAddress(String prisonAddress) {
        this.prisonAddress = prisonAddress;
    }

    public String getPrisonArea() {
        return prisonArea;
    }

    public void setPrisonArea(String prisonArea) {
        this.prisonArea = prisonArea;
    }

    public Integer getCriminalType() {
        return criminalType;
    }

    public void setCriminalType(Integer criminalType) {
        this.criminalType = criminalType;
    }

    public String getPrisonTerm() {
        return prisonTerm;
    }

    public void setPrisonTerm(String prisonTerm) {
        this.prisonTerm = prisonTerm;
    }

    public String getPrisonerName() {
        return prisonerName;
    }

    public void setPrisonerName(String prisonerName) {
        this.prisonerName = prisonerName;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getPrivilegeLevel() {
        return privilegeLevel;
    }

    public void setPrivilegeLevel(Integer privilegeLevel) {
        this.privilegeLevel = privilegeLevel;
    }

    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public Long getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Long registerTime) {
        this.registerTime = registerTime;
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
        return "Prisoner{" +
                "id=" + id +
                ", prisonerId=" + prisonerId +
                ", prisonerCodeNum='" + prisonerCodeNum + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", portraitUrl='" + portraitUrl + '\'' +
                ", prisonAddress='" + prisonAddress + '\'' +
                ", prisonArea='" + prisonArea + '\'' +
                ", criminalType=" + criminalType +
                ", prisonTerm='" + prisonTerm + '\'' +
                ", prisonerName='" + prisonerName + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", birthDate='" + birthDate + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", roleId=" + roleId +
                ", score=" + score +
                ", privilegeLevel=" + privilegeLevel +
                ", beginTime=" + beginTime +
                ", registerTime=" + registerTime +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public class Gender {
        private static final int MALE = 1;
        private static final int FEMALE = 2;
    }
}
