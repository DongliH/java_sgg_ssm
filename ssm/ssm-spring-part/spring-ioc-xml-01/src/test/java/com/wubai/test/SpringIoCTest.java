package com.wubai.test;
import com.wubai.ioc_03.HappyComponent;
import com.wubai.ioc_04.Javabean;
import com.wubai.ioc_05.JavaBean05;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoCTest {
    public void  createIoc(){
//方式1:实例化并且指定配置文件
//参数：String...locations 传入一个或者多个配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-03.xml");

//方式2:先实例化，再指定配置文件，最后刷新容器触发Bean实例化动作 [springmvc源码和contextLoadListener源码方式]

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext();
//设置配置配置文件,方法参数为可变参数,可以设置一个或者多个配置
        classPathXmlApplicationContext.setConfigLocations("spring-03.xml");
//后配置的文件,需要调用refresh方法,触发刷新配置
        classPathXmlApplicationContext.refresh();//调用ioc和di

    }

    public void getBeanFromIoc(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-03.xml");
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext();
////设置配置配置文件,方法参数为可变参数,可以设置一个或者多个配置
//        classPathXmlApplicationContext.setConfigLocations("spring-03.xml");
////后配置的文件,需要调用refresh方法,触发刷新配置
//        classPathXmlApplicationContext.refresh();//调用ioc和di
        //方法1
     HappyComponent happyComponent = (HappyComponent)applicationContext.getBean("happyComponent");
//        HappyComponent happyComponent =  classPathXmlApplicationContext.getBean(HappyComponent.class);
        happyComponent.doWork();
        //TODO:积期bean的类管获服,同一个类,在ioc容器中只能有个bean!!1
        // TODO :加果ioc容器存东多个网类型的Bean合出现:NoUniqueBeanDefinitionException
        //TODO :1oc的配置一定是实现类,但是可以根据接口类型获取值! getBean(类型);instanceof ioc容器的类型true
    }
    @Test
    public void test04(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-04.xml");
        Javabean bean1 = applicationContext.getBean(Javabean.class);
        Javabean bean2 = applicationContext.getBean(Javabean.class);
       if(bean1==bean2)
           System.out.println("xiangtong");
       else
           System.out.println("butong");
       applicationContext.close();
    }
    @Test
    public void test05(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-05.xml");
        JavaBean05 javabean05 = applicationContext.getBean("javabean05", JavaBean05.class);
        System.out.println(javabean05 );
        applicationContext.close();
    }
}
