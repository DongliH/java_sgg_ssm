package com.wubai.test;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wubai.entity.User;
import com.wubai.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MybatisTableIdTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void  test01(){
        User user = new User();
        user.setAge(1);
        user.setName("ck");
        userMapper.insert(user);
    }
    @Test
    public void  test02(){

        userMapper.deleteById(2);
    }
    @Test
    public void  test03(){

        userMapper.selectList(null);
    }

}
