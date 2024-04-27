package com.wubai.mapper;

import com.wubai.entity.Schedule;

import java.util.List;

public interface ScheduleMapper {
    List<Schedule> queryList();

    int deleteById(Integer id);

    int insert(Schedule schedule);

    int update(Schedule schedule);
}
