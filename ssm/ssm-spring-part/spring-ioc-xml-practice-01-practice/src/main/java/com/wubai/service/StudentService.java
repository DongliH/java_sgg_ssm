package com.wubai.service;

import com.wubai.entity.Student;

import java.util.List;

public interface StudentService {

    /**
     * 查询全部学员业务
     * @return
     */
    List<Student> findAll();

}