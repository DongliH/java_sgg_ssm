package com.wubai.json;


import com.wubai.entity.User;
import jakarta.enterprise.inject.New;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("json")
//@RestController  = @Controller + @ResponseBody

public class JsonController {

    @GetMapping("data")
    @ResponseBody //数据直接放入响应体返回，不会走视图解析器，快速查照视图，转发和重定向都不生效了
    public User data(){

        User user = new User();
        user.setAge(3);
        user.setName("wubai");
        return user;
    }

    @GetMapping("datalist")
    @ResponseBody
    public List<User> data1(){

        User user = new User();
        user.setAge(1);
        user.setName("XWL");
        List<User> arrayList = new ArrayList<>();
        arrayList.add(user);
        return arrayList;
    }

}
