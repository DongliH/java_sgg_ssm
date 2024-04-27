package com.wubai.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


//springc初始化类
public class SpringIocInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    //rootioc容器的配置类
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{DataSourceJavaConfig.class,MapperJavaConfig.class, ServiceJavaConfig.class};
    }
    //webioc 容器的配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebMvcJavaConfig.class};
    }
    //dusoatcherServlet 拦截路径
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
