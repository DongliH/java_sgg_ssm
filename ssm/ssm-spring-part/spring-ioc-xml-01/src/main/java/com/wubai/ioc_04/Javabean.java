package com.wubai.ioc_04;

public class Javabean {
    public void init(){
        System.out.println("Javabean.init");
    }
    public void cleanup() {
        System.out.println("释放资源逻辑");
    }
}
