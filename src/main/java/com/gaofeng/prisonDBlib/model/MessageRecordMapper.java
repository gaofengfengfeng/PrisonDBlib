package com.gaofeng.prisonDBlib.model;

import com.gaofeng.prisonDBlib.beans.msgrecord.Message;
import com.gaofeng.prisonDBlib.beans.msgrecord.ReceiverMsg;
import com.gaofeng.prisonDBlib.beans.msgrecord.SendType;
import com.gaofeng.prisonDBlib.beans.msgrecord.SpokeMsg;
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

    @Update("<script>" +
            " UPDATE message_record SET messageStatus=#{messageStatus} WHERE recordId IN (" +
            "<foreach item='recordId' collection='recordIds' index='index' separator =','>" +
            "#{recordId} " +
            "</foreach>" + ")" +
            "</script>")
    Integer batchUpdateMessageStatusByRecordId(@Param("messageStatus") Integer messageStatus,
                                               @Param("recordIds") List<Long> recordIds);

    @Select("SELECT recordId FROM message_record where messageStatus=1")
    List<Long> findWaitAuditRecords();
}
