package com.gaofeng.prisonDBlib.model;

/**
 * @Author: gaofeng
 * @Date: 2018-08-25
 * @Description:
 */
public class MessageStatistics {
    private Long id;
    private Long prisonerId;
    private String date;
    private Integer wordMsgTotalNum;
    private Integer picMsgTotalNum;
    private Integer voiceMsgTotalNum;
    private Integer vedioMsgTotalNum;
    private Integer wordMsgSendedNum;
    private Integer picMsgSendedNum;
    private Integer voiceMsgSendedNum;
    private Integer vedioMsgSendedNum;
    private Integer wordMsgUnpassNum;
    private Integer picMsgUnpassNum;
    private Integer voiceMsgUnpassNum;
    private Integer vedioMsgUnpassNum;
    private Long createTime;
    private Long updateTime;

    public MessageStatistics() {
        id = null;
        prisonerId = 0L;
        date = "";
        wordMsgTotalNum = 0;
        picMsgTotalNum = 0;
        voiceMsgTotalNum = 0;
        vedioMsgTotalNum = 0;
        wordMsgSendedNum = 0;
        picMsgSendedNum = 0;
        voiceMsgSendedNum = 0;
        vedioMsgSendedNum = 0;
        wordMsgUnpassNum = 0;
        picMsgUnpassNum = 0;
        voiceMsgUnpassNum = 0;
        vedioMsgUnpassNum = 0;
        createTime = 0L;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getWordMsgTotalNum() {
        return wordMsgTotalNum;
    }

    public void setWordMsgTotalNum(Integer wordMsgTotalNum) {
        this.wordMsgTotalNum = wordMsgTotalNum;
    }

    public Integer getPicMsgTotalNum() {
        return picMsgTotalNum;
    }

    public void setPicMsgTotalNum(Integer picMsgTotalNum) {
        this.picMsgTotalNum = picMsgTotalNum;
    }

    public Integer getVoiceMsgTotalNum() {
        return voiceMsgTotalNum;
    }

    public void setVoiceMsgTotalNum(Integer voiceMsgTotalNum) {
        this.voiceMsgTotalNum = voiceMsgTotalNum;
    }

    public Integer getVedioMsgTotalNum() {
        return vedioMsgTotalNum;
    }

    public void setVedioMsgTotalNum(Integer vedioMsgTotalNum) {
        this.vedioMsgTotalNum = vedioMsgTotalNum;
    }

    public Integer getWordMsgSendedNum() {
        return wordMsgSendedNum;
    }

    public void setWordMsgSendedNum(Integer wordMsgSendedNum) {
        this.wordMsgSendedNum = wordMsgSendedNum;
    }

    public Integer getPicMsgSendedNum() {
        return picMsgSendedNum;
    }

    public void setPicMsgSendedNum(Integer picMsgSendedNum) {
        this.picMsgSendedNum = picMsgSendedNum;
    }

    public Integer getVoiceMsgSendedNum() {
        return voiceMsgSendedNum;
    }

    public void setVoiceMsgSendedNum(Integer voiceMsgSendedNum) {
        this.voiceMsgSendedNum = voiceMsgSendedNum;
    }

    public Integer getVedioMsgSendedNum() {
        return vedioMsgSendedNum;
    }

    public void setVedioMsgSendedNum(Integer vedioMsgSendedNum) {
        this.vedioMsgSendedNum = vedioMsgSendedNum;
    }

    public Integer getWordMsgUnpassNum() {
        return wordMsgUnpassNum;
    }

    public void setWordMsgUnpassNum(Integer wordMsgUnpassNum) {
        this.wordMsgUnpassNum = wordMsgUnpassNum;
    }

    public Integer getPicMsgUnpassNum() {
        return picMsgUnpassNum;
    }

    public void setPicMsgUnpassNum(Integer picMsgUnpassNum) {
        this.picMsgUnpassNum = picMsgUnpassNum;
    }

    public Integer getVoiceMsgUnpassNum() {
        return voiceMsgUnpassNum;
    }

    public void setVoiceMsgUnpassNum(Integer voiceMsgUnpassNum) {
        this.voiceMsgUnpassNum = voiceMsgUnpassNum;
    }

    public Integer getVedioMsgUnpassNum() {
        return vedioMsgUnpassNum;
    }

    public void setVedioMsgUnpassNum(Integer vedioMsgUnpassNum) {
        this.vedioMsgUnpassNum = vedioMsgUnpassNum;
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
        return "MessageStatistics{" +
                "id=" + id +
                ", prisonerId=" + prisonerId +
                ", date='" + date + '\'' +
                ", wordMsgTotalNum=" + wordMsgTotalNum +
                ", picMsgTotalNum=" + picMsgTotalNum +
                ", voiceMsgTotalNum=" + voiceMsgTotalNum +
                ", vedioMsgTotalNum=" + vedioMsgTotalNum +
                ", wordMsgSendedNum=" + wordMsgSendedNum +
                ", picMsgSendedNum=" + picMsgSendedNum +
                ", voiceMsgSendedNum=" + voiceMsgSendedNum +
                ", vedioMsgSendedNum=" + vedioMsgSendedNum +
                ", wordMsgUnpassNum=" + wordMsgUnpassNum +
                ", picMsgUnpassNum=" + picMsgUnpassNum +
                ", voiceMsgUnpassNum=" + voiceMsgUnpassNum +
                ", vedioMsgUnpassNum=" + vedioMsgUnpassNum +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
