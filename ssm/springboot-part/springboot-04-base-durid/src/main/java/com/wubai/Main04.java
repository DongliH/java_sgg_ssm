package com.wubai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main04 {
    public static void main(String[] args) {
        SpringApplication.run(Main04.class,args);//自动创建ioc容器,启动tomcat服务器
    }
}