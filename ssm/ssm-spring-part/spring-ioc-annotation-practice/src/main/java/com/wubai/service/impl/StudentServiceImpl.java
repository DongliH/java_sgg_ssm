package com.wubai.service.impl;

import com.wubai.dao.StudentDao;
import com.wubai.entity.Student;
import com.wubai.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> queryAll() {
        List<Student> students = studentDao.queryAll();
        return students;
    }
}
