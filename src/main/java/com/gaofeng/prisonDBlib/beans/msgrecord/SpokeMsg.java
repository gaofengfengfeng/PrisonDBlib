package com.gaofeng.prisonDBlib.beans.msgrecord;

import java.util.List;

/**
 * @Author: gaofeng
 * @Date: 2018-08-26
 * @Description:
 */
public class SpokeMsg {
    private Long spokeId;
    private List<ReceiverMsg> receiverMsgs;

    public Long getSpokeId() {
        return spokeId;
    }

    public void setSpokeId(Long spokeId) {
        this.spokeId = spokeId;
    }

    public List<ReceiverMsg> getReceiverMsgs() {
        return receiverMsgs;
    }

    public void setReceiverMsgs(List<ReceiverMsg> receiverMsgs) {
        this.receiverMsgs = receiverMsgs;
    }

    @Override
    public String toString() {
        return "SpokeMsg{" +
                "spokeId=" + spokeId +
                ", receiverMsgs=" + receiverMsgs +
                '}';
    }
}
