package com.wubai.controller;


import com.wubai.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("param")
public class ParamController {

    @ResponseBody
    @RequestMapping("data")
    public String data (String name,int age){
        System.out.println("name = "+name+" "+"age = "+age);
        return "name = "+name+"age = "+age;
    }
    @ResponseBody
    @RequestMapping("data1")
    public String data1 (@RequestParam(value = "account") String name, @RequestParam(required = true,defaultValue = "1") int page){
        System.out.println("name = "+name+" "+"page = "+page);
        return "name = "+name+" age = "+page;
    }

//    private String name;
//    private  int   age;
    @ResponseBody
    @RequestMapping("data2")
    public String data2 (User user){
        System.out.println(user);
        return user.toString();
    }


}
