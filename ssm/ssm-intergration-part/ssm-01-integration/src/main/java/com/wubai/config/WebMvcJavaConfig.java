package com.wubai.config;


import com.wubai.interceptor.MyInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

//申明该类为配置类
@Configuration
//扫描包
@ComponentScan("com.wubai.controller")
//配置HandlerMaping HandlerAdapter 以及json数据格式
@EnableWebMvc
public class WebMvcJavaConfig  implements WebMvcConfigurer {
    //处理静态资源请求
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
    }
    //配置视图解析器
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
       registry.jsp("/WEB-INF/views/","jsp");
    }
    //拦截器配置
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
         registry.addInterceptor(new MyInterceptor());
    }
}
