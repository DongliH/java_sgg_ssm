package com.wubai.lambda;

import java.util.function.Function;

public class Lambda02 {
    public static void main(String[] args) {
//        Integer i = typeConver(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return s.length();
//            }
//        });
//        Integer i = typeConver((String s)-> {
//            return s.length();
//        });
//                Integer i = typeConver(s -> s.length());

        Integer i = typeConver((String str) -> {
            return str.length();
        });
        System.out.println(i);
    }
    public  static <R> R typeConver(Function<String,R> function){
        String str ="123345";
                R result =function.apply(str);
        return  result;
    }
}
