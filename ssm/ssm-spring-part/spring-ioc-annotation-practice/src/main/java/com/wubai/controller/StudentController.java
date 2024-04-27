package com.wubai.controller;


import com.wubai.entity.Student;
import com.wubai.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
   
    public void queryAll() {
        List<Student> studentList=studentService.queryAll();
        System.out.println("studentList = " + studentList);
    }
}
