package com.wubai.service;

import com.wubai.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
    
    @Autowired
    private StudentDao studentDao;
    @Transactional(readOnly = true,timeout = 3,rollbackFor = Exception.class,isolation = Isolation.READ_COMMITTED )
    public void changeInfo(){
        studentDao.updateAgeById(88,1);
        int i =1/0;
        System.out.println("-----------");
        studentDao.updateNameById("test1",1);
    }
}