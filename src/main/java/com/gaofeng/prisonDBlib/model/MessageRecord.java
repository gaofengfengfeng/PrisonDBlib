package com.gaofeng.prisonDBlib.model;

/**
 * @Author: gaofeng
 * @Date: 2018-08-25
 * @Description:
 */
public class MessageRecord {
    private Long id;
    private Long recordId;
    private Long spokeId; // 发言人id
    private Long receiverId; // 接收者id
    private Integer sendType; // 消息类型 0:未使用 1:罪犯->犯属 2:犯属->罪犯 3:犯属->监狱 4:监狱->犯属
    private Integer messageType; // 消息类型 0:未使用 1:文本 2:图片 3:语音 4:视频
    private String content;
    // 消息状态 0:未使用 1:等待审核 2:审核未通过 3:审核通过 4:已送达 5:已读 6:审核未通过结果送达 7:审核未通过结果已读
    private Integer messageStatus;
    private Long policeId;
    private Long sendTime;
    private Long auditFailedTime;
    private Long auditPassTime;
    private Long receiveTime;
    private Long readTime;
    private Long unpassResultReceiveTime;
    private Long unpassResultReadTime;
    private Long createTime;
    private Long updateTime;

    public class SendType {
        public static final int UNUSE = 0;
        public static final int PRISONER2FAMILY = 1;
        public static final int FAMILY2PRISONER = 2;
        public static final int FAMILY2POLICE = 3;
        public static final int POLICE2FAMILY = 4;
    }

    public class MessageType {
        public static final int UNUSE = 0;
        public static final int WORD = 1;
        public static final int PIC = 2;
        public static final int VOICE = 3;
        public static final int VEDIO = 4;
    }

    public class MessageStatus {
        public static final int UNUSE = 0;
        public static final int WAIT_AUDIT = 1;
        public static final int AUDIT_FAILD = 2;
        public static final int AUDIT_PASS = 3;
        public static final int RECEIVED = 4;
        public static final int READ = 5;
        public static final int UNPASS_RESULT_RECEIVED = 6;
        public static final int UNPASS_RESULT_READ = 7;
    }

    public MessageRecord() {
        id = null;
        recordId = 0L;
        spokeId = 0L;
        receiverId = 0L;
        sendType = 0;
        messageType = 0;
        content = "";
        messageStatus = 0;
        policeId = 0L;
        sendTime = 0L;
        auditFailedTime = 0L;
        auditPassTime = 0L;
        receiveTime = 0L;
        readTime = 0L;
        unpassResultReceiveTime = 0L;
        unpassResultReadTime = 0L;
        createTime = System.currentTimeMillis();
        updateTime = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getSpokeId() {
        return spokeId;
    }

    public void setSpokeId(Long spokeId) {
        this.spokeId = spokeId;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public Integer getSendType() {
        return sendType;
    }

    public void setSendType(Integer sendType) {
        this.sendType = sendType;
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

    public Long getPoliceId() {
        return policeId;
    }

    public void setPoliceId(Long policeId) {
        this.policeId = policeId;
    }

    public Long getSendTime() {
        return sendTime;
    }

    public void setSendTime(Long sendTime) {
        this.sendTime = sendTime;
    }

    public Long getAuditFailedTime() {
        return auditFailedTime;
    }

    public void setAuditFailedTime(Long auditFailedTime) {
        this.auditFailedTime = auditFailedTime;
    }

    public Long getAuditPassTime() {
        return auditPassTime;
    }

    public void setAuditPassTime(Long auditPassTime) {
        this.auditPassTime = auditPassTime;
    }

    public Long getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Long receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Long getReadTime() {
        return readTime;
    }

    public void setReadTime(Long readTime) {
        this.readTime = readTime;
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

    public Long getUnpassResultReceiveTime() {
        return unpassResultReceiveTime;
    }

    public void setUnpassResultReceiveTime(Long unpassResultReceiveTime) {
        this.unpassResultReceiveTime = unpassResultReceiveTime;
    }

    public Long getUnpassResultReadTime() {
        return unpassResultReadTime;
    }

    public void setUnpassResultReadTime(Long unpassResultReadTime) {
        this.unpassResultReadTime = unpassResultReadTime;
    }

    @Override
    public String toString() {
        return "MessageRecord{" +
                "id=" + id +
                ", recordId=" + recordId +
                ", spokeId=" + spokeId +
                ", receiverId=" + receiverId +
                ", sendType=" + sendType +
                ", messageType=" + messageType +
                ", content='" + content + '\'' +
                ", messageStatus=" + messageStatus +
                ", policeId=" + policeId +
                ", sendTime=" + sendTime +
                ", auditFailedTime=" + auditFailedTime +
                ", auditPassTime=" + auditPassTime +
                ", receiveTime=" + receiveTime +
                ", readTime=" + readTime +
                ", unpassResultReceiveTime=" + unpassResultReceiveTime +
                ", unpassResultReadTime=" + unpassResultReadTime +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
