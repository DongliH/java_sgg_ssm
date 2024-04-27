package com.wubai.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
@RestController
@RequestMapping("hello")
public class HelloController {
    @Value("${wubai.name}")
    private String name;
    @Value("${wubai.age}")
    private Integer age;
    @GetMapping("boot")
    public String hello(){
        return name+age;
    }
}
