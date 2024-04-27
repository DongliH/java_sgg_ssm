package com.wubai.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wubai.entity.Schedule;
import com.wubai.mapper.ScheduleMapper;
import com.wubai.service.ScheduleService;
import com.wubai.utils.PageBean;
import com.wubai.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleMapper scheduleMapper;
    public R page(int pageSize, int currentPage){
        //分页
        PageHelper.startPage(currentPage,pageSize);
        //查询
        List<Schedule> scheduleList=scheduleMapper.queryList();
        //分页数据装配
        PageInfo<Schedule> info = new PageInfo<>(scheduleList);

        //装配PageBean
        PageBean<Schedule> schedulePageBean = new PageBean<>(currentPage, pageSize, info.getTotal(), info.getList());
        R ok = R.ok(schedulePageBean);
        return ok;
    }

    @Override
    public R remove(Integer id) {
        int rows=scheduleMapper.deleteById(id);
        if(rows>0)
            return R.ok("删除成功");
        else
            return R.fail(null);

    }

    @Override
    public R save(Schedule schedule) {
        int rows=scheduleMapper.insert(schedule);
        if(rows>0)
            return R.ok("增加成功");
        else
            return R.fail(null);

    }

    @Override
    public R update(Schedule schedule) {
        if(schedule.getId()==null)
            return R.fail("id为空，无法修改");
        int rows=scheduleMapper.update(schedule);
        if(rows>0)
            return R.ok("修改成功");
        else
            return R.fail(null);
    }

}
