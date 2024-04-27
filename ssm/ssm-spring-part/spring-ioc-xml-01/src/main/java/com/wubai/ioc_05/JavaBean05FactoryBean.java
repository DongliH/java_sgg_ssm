package com.wubai.ioc_05;

import org.springframework.beans.factory.FactoryBean;

public class JavaBean05FactoryBean implements FactoryBean<JavaBean05> {
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public JavaBean05 getObject() throws Exception {
        //使用你自己的方法实例化对象
        JavaBean05 javaBean05 = new JavaBean05();
        javaBean05.setName(value);
        return javaBean05;
    }

    @Override
    public Class<?> getObjectType() {
        return JavaBean05.class;
    }
}
