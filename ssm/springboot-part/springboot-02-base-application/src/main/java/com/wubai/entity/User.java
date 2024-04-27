package com.wubai.entity;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "wubai.user")
//取代@value注解，同时可以对集合赋值
public class User {
    private  String username;
    private  String password;
    private List<String> gfs;
}
