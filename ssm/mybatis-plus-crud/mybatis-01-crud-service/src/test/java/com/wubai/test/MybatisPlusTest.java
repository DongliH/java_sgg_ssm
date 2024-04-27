package com.wubai.test;

import com.wubai.entity.User;
import com.wubai.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class MybatisPlusTest {
    @Autowired
    private UserService userService;
    @Test
    public void test_save(){
        List<User> list=new ArrayList<>();
        User user = new User();
        user.setName("lck");
        user.setAge(22);
        user.setEmail("lck@qq.com");

        User user1 = new User();
        user1.setName("wwx");
        user1.setAge(21);
        user1.setEmail("wwx@qq.com");

        list.add(user);
        list.add(user1);
        boolean b = userService.saveBatch(list);
        System.out.println(b);
    }
    @Test
    public void test_saveOrUpdate(){

        //如果id值不为空 修改，为null 则插入
        List<User> list=new ArrayList<>();
        User user = new User();
        user.setName("lck");
        user.setAge(22);
        user.setEmail("lck@qq.com");
        boolean b1 = userService.saveOrUpdate(user);

        System.out.println(b1);
    }
    @Test
    public void test_remove(){
        boolean b = userService.removeById(1);
        System.out.println(b);
    }
    @Test
    public void  update(){
        List<User> list=new ArrayList<>();
        User user = new User();
        user.setId(2L);
        user.setName("www");
        user.setAge(22);
        user.setEmail("lck@qq.com");
        boolean b1 = userService.updateById(user);
        System.out.println(b1);
    }

    @Test
    public void test_getOrList(){
        User byId = userService.getById(2L);
        System.out.println("signle"+byId);
        List<User> list = userService.list(null);
        System.out.println("List"+list);
    }
}
