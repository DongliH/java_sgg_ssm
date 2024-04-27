package com.wubai.controller;

import com.wubai.entity.Employee;
import com.wubai.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employService;

    @GetMapping ("find")
    public List<Employee> find(){
        List<Employee> all = employService.findAll();
        return all;
    }
}
