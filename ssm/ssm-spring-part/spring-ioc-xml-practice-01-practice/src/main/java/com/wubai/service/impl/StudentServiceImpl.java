package com.wubai.service.impl;

import com.wubai.dao.StudentDao;
import com.wubai.entity.Student;
import com.wubai.service.StudentService;

import java.util.List;

public class StudentServiceImpl  implements StudentService {
    
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    /**
     * 查询全部学员业务
     * @return
     */
    @Override
    public List<Student> findAll() {
        
        List<Student> studentList =  studentDao.queryAll();
        
        return studentList;
    }
}