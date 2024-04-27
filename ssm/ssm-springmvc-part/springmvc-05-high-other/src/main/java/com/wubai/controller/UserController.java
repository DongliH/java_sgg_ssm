package com.wubai.controller;


import com.wubai.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping("user")
@ResponseBody //接受或返回json数据
public class UserController {
    //RequestBody 接受请求体中的数据
    @PostMapping("register")
    public  Object register(@Validated @RequestBody User user, BindingResult result){
        if(result.hasErrors()){
            HashMap hashMap = new HashMap();
            hashMap.put("code",400);
            hashMap.put("msg","error");
            return hashMap;
        }
        System.out.println("user = " + user);
        return user;
    }

    //空指针异常
    @GetMapping("data")
    public String data(){

        String name =null;
//        name.toString();
        return "ok";
    }
    //算术异常
    @GetMapping("data1")
    public String data1(){

//        int i=1/0;
        return "ok";
    }
}
