package com.wubai.test;

import com.wubai.ioc_01.XxxDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SpringIoCTest {
    @Test
    public void  test01(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-01.xml");
        XxxDao bean = classPathXmlApplicationContext.getBean(XxxDao.class);
        System.out.println("bean ="+bean);
        Object xxxService = classPathXmlApplicationContext.getBean("xxxService");
        System.out.println(xxxService);
    }
}
