package com.wubai.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("test")
public class HelloController {
    @GetMapping("hello")
    public String ret(){
        return "hello";
    }

}
