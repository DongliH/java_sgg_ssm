package com.wubai.controller;


import com.wubai.entity.User;
import com.wubai.mapper.UserMapper;
import com.wubai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("query")
    public  List<User> queryAll(){
        return userService.queryAll();

    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable int id){
//        int id = Integer.parseInt(idstr);
        String row = userService.delete(id);
        return row;
    }
}
