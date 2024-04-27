package com.wubai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main03 {
    public static void main(String[] args) {
        SpringApplication.run(Main03.class,args);//自动创建ioc容器,启动tomcat服务器
    }
}