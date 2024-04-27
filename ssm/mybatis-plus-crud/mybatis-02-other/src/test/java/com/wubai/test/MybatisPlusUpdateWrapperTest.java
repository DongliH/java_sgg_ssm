package com.wubai.test;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.wubai.entity.User;
import com.wubai.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
public class MybatisPlusUpdateWrapperTest {
    @Autowired
    private UserMapper userMapper;

    //QueryWrapper
    //需要准备实体类
    //不能改为null
    //UpdateWrapper
    //1.直接携带修改数据 set（"列名"，"zhi"）
    //2.可以修改为null
    //查照
    @Test
    public void test_01() {
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.gt("age", 20).like("name", "a").or().isNull("email").set("email",null)
                .set("age",99);

        LambdaUpdateWrapper<User> lambdaUpdateWrapper = new LambdaUpdateWrapper<>();
        lambdaUpdateWrapper.gt(User::getAge, 20).like(User::getName, "a").or().isNull(User::getEmail)
                .set(User::getAge,99);
    }
}
