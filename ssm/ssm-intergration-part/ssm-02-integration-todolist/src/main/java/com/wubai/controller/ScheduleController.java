package com.wubai.controller;


import com.wubai.entity.Schedule;
import com.wubai.service.ScheduleService;
import com.wubai.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@CrossOrigin //允许其他院访问我们的浏览器
@Controller
@ResponseBody
@RequestMapping("schedule")
@Slf4j
public class ScheduleController {
    //查询
    @Autowired
    private  ScheduleService scheduleService;
    @GetMapping("/{pageSize}/{currentPage}")
    public R page(@PathVariable int pageSize , @PathVariable int currentPage){

        R r = scheduleService.page(pageSize,currentPage);
        log.info("查询的数据为：{}",r);//r替换{}

        return r;
    }
    //更具id删除
    @DeleteMapping("/{id}")
    public R remove(@PathVariable Integer id){
        R r =scheduleService.remove(id);
        return r;
    }
    //保存
    //Validated 可以使注解生效 BindingResult 当不满足输入条件时 报错
    @PostMapping
    public R save(@Validated @RequestBody Schedule schedule, BindingResult result){
        if(result.hasErrors()){
            return  R.fail("参数为空，不能报错");
        }
        R r=scheduleService.save(schedule);
         return  r;
    }
    @PutMapping
    public R update(@Validated @RequestBody Schedule schedule,BindingResult result){
        if(result.hasErrors()){
            return  R.fail("参数为null，不能修改");

        }
        R r =scheduleService.update(schedule);
        return r;

    }

}
