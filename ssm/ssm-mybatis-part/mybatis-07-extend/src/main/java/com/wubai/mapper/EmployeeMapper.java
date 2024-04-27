package com.wubai.mapper;

import com.wubai.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {

    List<Employee> queryList();
}
