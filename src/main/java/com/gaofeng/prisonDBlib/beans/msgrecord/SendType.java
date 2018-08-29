package com.gaofeng.prisonDBlib.beans.msgrecord;

import java.util.List;

/**
 * @Author: gaofeng
 * @Date: 2018-08-26
 * @Description:
 */

public class SendType {
    private Integer sendType;
    private List<SpokeMsg> spokeMsgs;

    public Integer getSendType() {
        return sendType;
    }

    public void setSendType(Integer sendType) {
        this.sendType = sendType;
    }

    public List<SpokeMsg> getSpokeMsgs() {
        return spokeMsgs;
    }

    public void setSpokeMsgs(List<SpokeMsg> spokeMsgs) {
        this.spokeMsgs = spokeMsgs;
    }
}
