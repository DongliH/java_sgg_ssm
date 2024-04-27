package com.wubai.dao;

import com.wubai.entity.Student;

import java.util.List;

public interface StudentDao {

    /**
     * 查询全部学生数据
     * @return
     */
    List<Student> queryAll();
}