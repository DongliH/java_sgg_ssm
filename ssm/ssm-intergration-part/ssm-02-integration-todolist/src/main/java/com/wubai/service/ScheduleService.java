package com.wubai.service;

import com.wubai.entity.Schedule;
import com.wubai.utils.R;

public interface ScheduleService {
    R page(int pageSize, int currentPage);

    R remove(Integer id);

    R save(Schedule schedule);

    R update(Schedule schedule);
}
