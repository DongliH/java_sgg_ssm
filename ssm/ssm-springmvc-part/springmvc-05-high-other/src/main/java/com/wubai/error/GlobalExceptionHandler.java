package com.wubai.error;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;


//全局异常发生，会走此类写的handler
@ControllerAdvice //可以返回逻辑视图，转发和重定向
@ResponseBody//@ControllerAdvice+ResponseBody 等于直接返回json
public class GlobalExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    public Object arithmeticExceptionHandler(ArithmeticException e){
        String message = e.getMessage();
        System.out.println(" 1. message= "+message);
        return "baocuo";
    }

    @ExceptionHandler(Exception.class)
    public Object exceptionHandler(Exception e){

        String message = e.getMessage();
        System.out.println(" 2.  message=  "+message);
        return message;
    }
}
