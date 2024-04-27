package com.wubai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("path")
@ResponseBody
public class PathController {

    @RequestMapping("{account}/{password}")
    public String data3 (@PathVariable String account , @PathVariable String password){
        System.out.println(account + "  "+ password);
        return account + "  "+ password;
    }

}
