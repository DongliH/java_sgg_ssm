package com.wubai.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("login") //url映射
    @PostMapping
    public  String login(){


        return null;
    }

    @RequestMapping("register") //url映射
    public  String register(){


        return null;
    }
}
