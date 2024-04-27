package com.wubai.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("header")
@ResponseBody
public class HeaderController {

    @GetMapping("data")
    public String data(@RequestHeader("Host") String host){

        System.out.println("host = " + host);
        return host;
    }
}
