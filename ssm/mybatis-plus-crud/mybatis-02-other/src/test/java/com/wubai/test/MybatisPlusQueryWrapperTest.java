package com.wubai.test;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wubai.entity.User;
import com.wubai.mapper.UserMapper;
import com.wubai.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.management.Query;
import java.util.List;

@SpringBootTest
public class MybatisPlusQueryWrapperTest {
    @Autowired
    private UserMapper userMapper;

    //查照
    @Test
    public void test_01() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", "a");
        queryWrapper.between("age", "20", "30");
        queryWrapper.isNotNull("email");
        List<User> users = userMapper.selectList(queryWrapper);
        System.out.println(users);
    //lamda biaodashi
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(User::getName, "a").between(User::getAge, "20", "30").isNotNull(User::getEmail);

    }

    //查
    @Test
    public void test_02() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("age").orderByAsc("id");
        List<User> users = userMapper.selectList(queryWrapper);
        System.out.println(users);
    }

    @Test
    public void test_delete_email() {
        //删除email 为空的用户
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNull("email");
        userMapper.delete(queryWrapper);
    }

    @Test
    public void test_or() {

        User user = new User();
        user.setAge(88);
        user.setEmail("hhhh");

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNull("email");
        //  name like a and age >20 or email is null
        queryWrapper.gt("age", 20).like("name", "a").or().isNull("email");
        userMapper.update(user, queryWrapper);
    }

    //查询指定列
    @Test
    public void test_name_age() {


        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("id", 1L);
        queryWrapper.select("name", "age");
        //  name like a and age >20 or email is null

        userMapper.selectList(queryWrapper);
    }

    @Test
    public void test_6() {
        //动态语句
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        String name ="xx";
        Integer age =19;
//        if(StringUtils.isNotBlank(name)){
//            queryWrapper.eq("name",name);
//
//        }
//        if(age!=null&&age>18){
//            queryWrapper.eq("age",age);
//        }
//
//
        queryWrapper.eq(StringUtils.isNotBlank(name),"name",name);
        queryWrapper.eq(age!=null&&age>18,"age",age);
        queryWrapper.gt("id", 1L);
        queryWrapper.select("name", "age");
        //  name like a and age >20 or email is null

        userMapper.selectList(queryWrapper);
    }
}
