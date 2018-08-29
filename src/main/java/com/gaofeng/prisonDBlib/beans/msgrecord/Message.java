package com.gaofeng.prisonDBlib.beans.msgrecord;

/**
 * @Author: gaofeng
 * @Date: 2018-08-26
 * @Description:
 */
public class Message {
    private Integer messageType;
    private String content;

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

    @Override
    public String toString() {
        return "Message{" +
                "messageType=" + messageType +
                ", content='" + content + '\'' +
                '}';
    }
}
