package com.wubai.mapper;

import com.wubai.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {

    Employee queryById (Integer id);
    int deleteById (Integer id);
    List<Employee> queryBySalary(Double salary);
    int insertEmp (Employee employee);
    List<Employee> queryByNameAndSalary(@Param("a") String name, @Param("b") Double salary);
//List<Employee> queryByNameAndSalary( String name,Double salary);

}
