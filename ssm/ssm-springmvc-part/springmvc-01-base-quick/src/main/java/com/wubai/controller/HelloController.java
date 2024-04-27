package com.wubai.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("springmvc/hello") //url映射
    @ResponseBody //直接返回字符串给前端，不需要视图解析器
    public  String hello(){

        System.out.println("hello HelloController");
        return "hello springmvc";
    }
}
