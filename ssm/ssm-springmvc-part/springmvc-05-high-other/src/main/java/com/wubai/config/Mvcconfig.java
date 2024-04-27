package com.wubai.config;


import com.wubai.interceptor.MyInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@ComponentScan("com.wubai")
@EnableWebMvc //handlerAdapter 配置json转化器  添加下面这两个
public class Mvcconfig implements WebMvcConfigurer {
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {

        //registry 可以快速添加前后缀
        registry.jsp("/WEB-INF/views/",".jsp");
    }
    //开启静态资源处理
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //将拦截器添加到Springmvc环境,默认拦截所有Springmvc分发的请求
        registry.addInterceptor(new MyInterceptor());
    }
}
