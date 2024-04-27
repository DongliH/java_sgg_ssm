package com.wubai.service.impl;

import com.wubai.entity.Employee;
import com.wubai.mapper.EmployeeMapper;
import com.wubai.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
   @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> findAll() {
        List<Employee> employees = employeeMapper.queryList();
        return employees;
    }
}
