package com.gaofeng.prisonDBlib.beans.msgrecord;

/**
 * @Author: gaofeng
 * @Date: 2018-08-30
 * @Description:
 */
public class WaitReadMsgDetail {
    private Long recordId;
    private Integer messageType;
    private String content;
    private Integer messageStatus;
    private Long spokeId;
    private Long recerverId;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(Integer messageStatus) {
        this.messageStatus = messageStatus;
    }

    public Long getSpokeId() {
        return spokeId;
    }

    public void setSpokeId(Long spokeId) {
        this.spokeId = spokeId;
    }

    public Long getRecerverId() {
        return recerverId;
    }

    public void setRecerverId(Long recerverId) {
        this.recerverId = recerverId;
    }

    @Override
    public String toString() {
        return "WaitReadMsgDetail{" +
                "recordId=" + recordId +
                ", messageType=" + messageType +
                ", content='" + content + '\'' +
                ", messageStatus=" + messageStatus +
                ", spokeId=" + spokeId +
                ", recerverId=" + recerverId +
                '}';
    }
}
