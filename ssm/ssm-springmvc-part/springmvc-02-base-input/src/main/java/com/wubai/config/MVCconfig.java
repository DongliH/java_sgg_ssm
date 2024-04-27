package com.wubai.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;


@EnableWebMvc //handlerAdapter 配置json转化器  添加下面这两个
@Configuration
@ComponentScan("com.wubai.controller")
public class MVCconfig {

//    @Bean
//    public RequestMappingHandlerMapping handlerMapping(){
//        return new RequestMappingHandlerMapping();
//    }
//    @Bean
//    public RequestMappingHandlerAdapter handlerAdapter(){
//        return new  RequestMappingHandlerAdapter();
//    }

}
