package com.wubai.test;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wubai.entity.User;
import com.wubai.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MybatisPlusTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public  void  testPage(){
        Page<User> page = new Page<>(1, 3);//第几页，每页多少个
        userMapper.selectPage( page,null);

        //page 也会封装
        long current = page.getCurrent();//页码
        long size = page.getSize(); //页容量
        List<User> records = page.getRecords(); //当前页的数据
        long total = page.getTotal();//总条数
    }

    @Test
    public  void test_mypage(){
        Page<User> page = new Page<>(1, 3);//第几页，每页多少个
        userMapper.queryByAge(page,1);
        //page 也会封装
        long current = page.getCurrent();//页码
        long size = page.getSize(); //页容量
        System.out.println("size  :"+size);
        List<User> records = page.getRecords(); //当前页的数据
        System.out.println("record :"+records);
        long total = page.getTotal();//总条数
        System.out.println("total :" +total);
    }
}
