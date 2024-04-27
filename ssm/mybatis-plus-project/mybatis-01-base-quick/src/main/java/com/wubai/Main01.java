package com.wubai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wubai.mapper")
@SpringBootApplication
public class Main01 {
    public static void main(String[] args) {
        SpringApplication.run(Main01.class, args);//自动创建ioc容器,启动tomcat服务器
    }
}