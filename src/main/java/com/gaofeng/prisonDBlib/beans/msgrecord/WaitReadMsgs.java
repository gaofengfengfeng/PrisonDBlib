package com.gaofeng.prisonDBlib.beans.msgrecord;

import java.util.List;

/**
 * @Author: gaofeng
 * @Date: 2018-08-30
 * @Description:
 */
public class WaitReadMsgs {

    private Long spokeId;
    private List<WaitReadMsgDetail> waitReadMsgDetails;

    public Long getSpokeId() {
        return spokeId;
    }

    public void setSpokeId(Long spokeId) {
        this.spokeId = spokeId;
    }

    public List<WaitReadMsgDetail> getWaitReadMsgDetails() {
        return waitReadMsgDetails;
    }

    public void setWaitReadMsgDetails(List<WaitReadMsgDetail> waitReadMsgDetails) {
        this.waitReadMsgDetails = waitReadMsgDetails;
    }

    @Override
    public String toString() {
        return "WaitReadMsgs{" +
                "spokeId=" + spokeId +
                ", waitReadMsgDetails=" + waitReadMsgDetails +
                '}';
    }
}
