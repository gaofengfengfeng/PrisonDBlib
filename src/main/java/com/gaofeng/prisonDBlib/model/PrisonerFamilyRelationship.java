package com.gaofeng.prisonDBlib.model;

/**
 * @Author: gaofeng
 * @Date: 2018-08-24
 * @Description:
 */
public class PrisonerFamilyRelationship {

    private Long id;
    private Long relationshipId;
    private Long prisonerId;
    private Long prisonerFamilyId;
    private String relationship;
    private Long createTime;
    private Long updateTime;

    public PrisonerFamilyRelationship() {
        id = null;
        relationshipId = 0L;
        prisonerId = 0L;
        prisonerFamilyId = 0L;
        relationship = "";
        createTime = System.currentTimeMillis();
        updateTime = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRelationshipId() {
        return relationshipId;
    }

    public void setRelationshipId(Long relationshipId) {
        this.relationshipId = relationshipId;
    }

    public Long getPrisonerId() {
        return prisonerId;
    }

    public void setPrisonerId(Long prisonerId) {
        this.prisonerId = prisonerId;
    }

    public Long getPrisonerFamilyId() {
        return prisonerFamilyId;
    }

    public void setPrisonerFamilyId(Long prisonerFamilyId) {
        this.prisonerFamilyId = prisonerFamilyId;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
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
        return "PrisonerFamilyRelationship{" +
                "id=" + id +
                ", relationshipId=" + relationshipId +
                ", prisonerId=" + prisonerId +
                ", prisonerFamilyId=" + prisonerFamilyId +
                ", relationship='" + relationship + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
