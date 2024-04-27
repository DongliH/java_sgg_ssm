package com.wubai.test;


import com.wubai.entity.User;
import com.wubai.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class SpringBootMybatisPlus {

    @Autowired
    private UserMapper userMapper;

    @Test
    public  void test(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    public void  test_insert(){
        User user = new User();
        user.setName("wubai");
        user.setAge(1);
        user.setEmail("28144434406");
        int row = userMapper.insert(user);

    }
    @Test
    public void  test_delete(){

        int row = userMapper.deleteById(1);

        HashMap param = new HashMap();
        param.put("age",20);
        int delete = userMapper.deleteByMap(param);

    }

    @Test
    public void  test_update(){
        //todo:update 属性为空不作操作
        User user = new User();
        user.setId(1L);
        user.setAge(30);
        int i = userMapper.updateById(user);
        System.out.println("第一个查询"+i);
        User user1 = new User();
        user1.setAge(22);
        int update = userMapper.update(user1, null);
        System.out.println("第二个查询"+update);

    }

    @Test
    public void  test_select(){
        //todo:update 属性为空不作操作
        User user = userMapper.selectById(3L);
        System.out.println("3:  "+user);
        List<Long> users=new ArrayList<>();
        users.add(3L);
        users.add(4L);
        List<User> users1 = userMapper.selectBatchIds(users);
        System.out.println(users1);

    }
}
