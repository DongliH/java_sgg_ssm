package com.wubai.mapper;

import com.wubai.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {

 //dml语句 插入 修改 删除
 Employee qureyById(Integer id);

 //
 String qureyNameById(Integer id);

 //
 Double qureySalaryById(Integer id);

 Map<String, Object> selectEmpNameAndMaxSalary();

 List<String> qureyNameBySalary(Double salary);

 List<Employee> queryAll();

 int insertEmp(Employee employee);
}
