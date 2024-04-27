package com.wubai.mapper;

import com.wubai.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {

    List<Employee> selectEmployeeByCondition(@Param("name") String name, @Param("salary") Double salary);
    List<Employee> selectEmployeeByConditionTrim(@Param("name") String name, @Param("salary") Double salary);
    List<Employee> queryChoose(@Param("name") String name, @Param("salary") Double salary);
    int update(Employee employee);
    //根据id 批量查询
    List<Employee> queryBatch (@Param("ids") List<Integer> ids);
    //更具id 批量删除
    int deleteBatch (@Param("ids") List<Integer> ids);
    //批量增加
    int inserBatch(@Param("list") List<Employee> employees);
    //批量修改
    int updateBatch(@Param("list")List<Employee> employees);
}
