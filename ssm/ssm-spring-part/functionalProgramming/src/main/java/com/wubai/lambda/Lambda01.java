package com.wubai.lambda;

import java.util.function.IntBinaryOperator;

public class Lambda01 {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }).start();
        new Thread(()->{System.out.println("创建新线程");}).start();
//快捷建 alt+enter
        int i = calculateNum(new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        });

        int i1 = calculateNum((int a, int b) -> {return a + b ;});
        System.out.println(i1);
    }
    public static int calculateNum(IntBinaryOperator operator){
        int a=10;
        int b=20;
        return operator.applyAsInt(a,b);
    }
}
