package com.wubai.ioc_02;

import com.alibaba.druid.filter.AutoLoad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Controller
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON) //单例,默认值
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE) //多例  二选一
public class JavaBean {
    @Resource
    private UserService userService;



    @PostConstruct  //注解制指定初始化方法
    public void init() {
        // 初始化逻辑
    }

    @PreDestroy //注解指定销毁方法 多例不会管理
    public void cleanup() {
        // 释放资源逻辑
    }
}

