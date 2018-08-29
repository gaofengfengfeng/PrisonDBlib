package com.gaofeng.prisonDBlib.beans.msgrecord;

import java.util.List;

/**
 * @Author: gaofeng
 * @Date: 2018-08-26
 * @Description:
 */
public class ReceiverMsg {
    private Long receiverId;
    private List<Message> msgs;

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public List<Message> getMsgs() {
        return msgs;
    }

    public void setMsgs(List<Message> msgs) {
        this.msgs = msgs;
    }

    @Override
    public String toString() {
        return "ReceiverMsg{" +
                "receiverId=" + receiverId +
                ", msgs=" + msgs +
                '}';
    }
}
