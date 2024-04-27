package com.wubai.controller;


import com.wubai.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@Controller
@RequestMapping("user")
public class UserController {
    //更具分页查询
    @GetMapping
    public List<User> page(@RequestParam(required = false, defaultValue = "1") int page,
                           @RequestParam(required = false, defaultValue = "1") int size) {


        System.out.println("page = " + page + ", size = " + size);
        return null;
    }
    //用户添加
    @PostMapping
    public User save(@RequestBody User user){

        return  user;
    }

    //根据id查询
    @GetMapping("{id}")
    public User detail(@PathVariable Integer id){
        return  null;

    }

    //用户更新
    @PutMapping
    public User update(@RequestBody User user){
        return null;
    }


    //用户删除
    @DeleteMapping("{id}")
    public User delete( @PathVariable Integer id){
        return null;

    }
    @GetMapping("search")
    public List<User> search(String keywork,@RequestParam(required = false,defaultValue = "1")int page,
                             @RequestParam(required = false,defaultValue = "10")int size)
    {
        return null;
    }
}
