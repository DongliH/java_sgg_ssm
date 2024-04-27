package com.wubai.service;

import com.wubai.entity.User;
import com.wubai.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    @Transactional//增加事务，发生异常会回滚事务
    public String delete(int id){

        int rows =userMapper.delete(id);
//        int i=1/0;
        if(rows>0)
            return "删除成功";
        else
            return "删除失败";


    }
    @Transactional//增加事务，发生异常会回滚事务
    public List<User> queryAll(){

        List<User> queryall = userMapper.queryAll();
       return  queryall;

    }
}
