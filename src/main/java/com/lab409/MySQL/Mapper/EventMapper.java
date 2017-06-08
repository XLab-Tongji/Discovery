package com.lab409.MySQL.Mapper;

import org.apache.ibatis.annotations.Insert;
import com.lab409.MySQL.Entity.EventDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author xianganying
 * @version v0.1 2017/5/19.
 */

@Mapper
public interface EventMapper {
    /**
     * 插入事件
     * @param eventDO
     * @return
     */
    @Insert("INSERT INTO events(position_x, position_y, content, student_id) " +
            "VALUES(#{position_x}, #{position_y}, #{content}, #{student_id})")
    int insertEvent(EventDO eventDO);

    /**
     * 单个事件获取
     * @param event_id
     * @return
     */
    @Select("SELECT * FROM events WHERE event_id=#{event_id}")
    EventDO getEventByEventId(@Param("event_id")Integer event_id);
}