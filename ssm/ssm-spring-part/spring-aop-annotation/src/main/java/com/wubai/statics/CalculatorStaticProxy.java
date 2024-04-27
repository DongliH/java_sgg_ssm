package com.wubai.statics;

import org.junit.jupiter.api.Test;

public class CalculatorStaticProxy implements Calculator {
    
    // 将被代理的目标对象声明为成员变量
    private Calculator target;
    
    public CalculatorStaticProxy(Calculator target) {
        this.target = target;
    }
    
    @Override
    public int add(int i, int j) {
    
        // 附加功能由代理类中的代理方法来实现
        System.out.println("参数是：" + i + "," + j);
    
        // 通过目标对象来实现核心业务逻辑
        int addResult = target.add(i, j);
    
        System.out.println("方法内部 result = " + addResult);
    
        return addResult;
    }

    public static void main(String[] args) {
        Calculator calculator1 = new CalculatorImpl();
        Calculator calculator = new CalculatorStaticProxy(calculator1 );
        int add = calculator.add(1, 1);
    }

//    @Test
//    public void test01(){
//        Calculator calculator1 = new CalculatorImpl();
//        Calculator calculator = new CalculatorStaticProxy(calculator1 );
//        int add = calculator.add(1, 1);
//
//
//    }
}