package com.gaofeng.prisonDBlib.model;

import com.gaofeng.prisonDBlib.beans.audit.Message;
import com.gaofeng.prisonDBlib.beans.audit.ReceiverMsg;
import com.gaofeng.prisonDBlib.beans.audit.SendType;
import com.gaofeng.prisonDBlib.beans.audit.SpokeMsg;
import com.gaofeng.prisonDBlib.beans.msgrecord.WaitReadMsgDetail;
import com.gaofeng.prisonDBlib.beans.msgrecord.WaitReadMsgs;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Author: gaofeng
 * @Date: 2018-08-26
 * @Description:
 */
@Component
@Mapper
public interface MessageRecordMapper {

    /**
     * 插入记录
     *
     * @param messageRecord
     *
     * @return
     */
    @Insert("INSERT INTO message_record(recordId, spokeId, receiverId, sendType, messageType, " +
            "content, messageStatus, sendTime, createTime) VALUES(#{recordId}, #{spokeId}, " +
            "#{receiverId}, #{sendType}, #{messageType}, #{content}, #{messageStatus}, " +
            "#{sendTime}, #{createTime})")
    Integer save(MessageRecord messageRecord);

    /**
     * 查找待审核记录
     *
     * @return
     */
    @Select("SELECT DISTINCT sendType FROM message_record WHERE messageStatus=1")
    @Results({
            @Result(property = "sendType", column = "sendType"),
            @Result(property = "spokeMsgs", column = "sendType", javaType = List.class,
                    many = @Many(select = "com.gaofeng.prisonDBlib.model.MessageRecordMapper" +
                            ".findSpokeMsg"))
    })
    List<SendType> findAuditMsgRecord();

    /**
     * 查找待审核记录附属，查找某个发言人的记录
     *
     * @param sendType
     *
     * @return
     */
    @Select("SELECT DISTINCT spokeId, sendType FROM message_record where sendType = #{sendType} " +
            "AND messageStatus=1")
    @Results({
            @Result(property = "spokeId", column = "spokeId"),
            @Result(property = "receiverMsgs", column = "{spokeId=spokeId,sendType=sendType}",
                    javaType = List.class,
                    many = @Many(select = "com.gaofeng.prisonDBlib.model.MessageRecordMapper" +
                            ".findReceiverMsg"))
    })
    List<SpokeMsg> findSpokeMsg(Integer sendType);

    /**
     * 查找待审核记录附属，查找某个接收者的记录
     *
     * @param param
     *
     * @return
     */
    @Select("SELECT DISTINCT receiverId, spokeId, sendType FROM message_record WHERE spokeId = " +
            "#{spokeId} AND sendType = #{sendType} AND messageStatus=1")
    @Results({
            @Result(property = "receiverId", column = "receiverId"),
            @Result(property = "msgs", column = "{receiverId=receiverId, spokeId=spokeId, " +
                    "sendType=sendType}", javaType = List.class,
                    many = @Many(select = "com.gaofeng.prisonDBlib.model.MessageRecordMapper" +
                            ".selectByReceiverId"))

    })
    List<ReceiverMsg> findReceiverMsg(Map<String, Object> param);

    /**
     * 根据发言人id、接收者id、sendType以及消息状态查找待审核的记录的内容
     *
     * @param param
     *
     * @return
     */
    @Select("SELECT recordId, messageType, content FROM message_record where receiverId = " +
            "#{receiverId} and" +
            " spokeId=#{spokeId} and sendType=#{sendType} and messageStatus=1")
    List<Message> selectByReceiverId(Map<String, Object> param);

    /**
     * 批量更新记录的状态以及相应更新时间 <if test= \"messageStatus " +
     *             "== 3\"> ,auditPassTime=#{time} </if>
     *
     * @param messageStatus
     * @param recordIds
     * @param time
     *
     * @return
     */
    @Update("<script>" +
            " UPDATE message_record SET messageStatus=#{messageStatus} <choose> " +
            "<when test=\" messageStatus==2\">" +
            ",auditFailedTime=#{time}" +
            "</when>" +
            "<when test=\" messageStatus==3\">" +
            ",auditPassTime=#{time}" +
            "</when>" +
            "<when test=\" messageStatus==4\">" +
            ",receiveTime=#{time}" +
            "</when>" +
            "<when test=\" messageStatus==5\">" +
            ",readTime=#{time}" +
            "</when>" +
            "<when test=\" messageStatus==6\">" +
            ",unpassResultReceiveTime=#{time}" +
            "</when>" +
            "<when test=\" messageStatus==7\">" +
            ",unpassResultReadTime=#{time}" +
            "</when>" +
            "</choose> WHERE recordId IN (" +
            "<foreach item='recordId' collection='recordIds' index='index' separator =','>" +
            "#{recordId} " +
            "</foreach>" + ")" +
            "</script>")
    Integer batchUpdateMessageStatusByRecordId(@Param("messageStatus") Integer messageStatus,
                                               @Param("recordIds") List<Long> recordIds, @Param(
            "time") Long time);

    /**
     * 根据单个消息状态，查找消息记录
     *
     * @param messageStatus
     *
     * @return
     */
    @Select("SELECT recordId FROM message_record where messageStatus=#{messageStatus}")
    List<Long> findByMessageStatus(Integer messageStatus);


    /**
     * 查找犯人、犯属待读消息
     *
     * @param receiverId
     *
     * @return
     */
    @Select("SELECT DISTINCT spokeId, receiverId FROM message_record where " +
            "receiverId=#{receiverId} AND (messageStatus=3 OR messageStatus=4)")
    @Results({
            @Result(property = "spokeId", column = "spokeId"),
            @Result(property = "waitReadMsgDetails", column = "{spokeId=spokeId, " +
                    "receiverId=receiverId}", javaType = List.class,
                    many = @Many(select = "com.gaofeng.prisonDBlib.model.MessageRecordMapper" +
                            ".findWaitReadMsgDetail"))
    })
    List<WaitReadMsgs> findWaitReadMsgs(Long receiverId);

    /**
     * 查找犯人、犯属待读消息附属，查找某条消息的详细内容
     *
     * @param param
     *
     * @return
     */
    @Select("SELECT recordId, messageType, content, messageStatus, spokeId, receiverId FROM " +
            "message_record WHERE spokeId=#{spokeId} AND receiverId=#{receiverId} AND " +
            "(messageStatus=3 OR messageStatus=4)")
    List<WaitReadMsgDetail> findWaitReadMsgDetail(Map<String, Object> param);

    @Select("SELECT recordId, messageType, content, messageStatus, spokeId, receiverId FROM " +
            "message_record WHERE spokeId=#{spokeId} AND (messageStatus=2 OR messageStatus=6)")
    List<WaitReadMsgDetail> findUnpassMsgs(Long spokeId);
}
