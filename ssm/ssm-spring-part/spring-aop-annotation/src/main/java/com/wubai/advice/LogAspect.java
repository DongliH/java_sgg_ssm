package com.wubai.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.reflect.Modifier;

// @Aspect表示这个类是一个切面类
@Aspect
// @Component注解保证这个切面类能够放入IOC容器

@Component
public class LogAspect {
    //@AfterReturning(value = "execution(public int com.atguigu.proxy.CalculatorPureImpl.add(int,int))")
    // @Before注解：声明当前方法是前置通知方法
    // value属性：指定切入点表达式，由切入点表达式控制当前通知方法要作用在哪一个目标方法上
    @Pointcut("execution(* com.wubai.service.*.*(..))")
    public  void  pc(){

    }
    @Before(value ="pc()")
    public void printLogBeforeCore(JoinPoint joinPoint) {
        //类的信息
//        String simpleName = joinPoint.getTarget().getClass().getSimpleName();
//        System.out.println(simpleName);
//        //方法名称
//        int modifiers = joinPoint.getSignature().getModifiers();
//        String string = Modifier.toString(modifiers);
//        System.out.println(string);
//        //参数
//        for (Object arg : joinPoint.getArgs()) {
//            System.out.println(arg);
//        }

        System.out.println("[AOP前置通知] 方法开始了");
    }

    @AfterReturning(value ="pc()")
    public void printLogAfterSuccess() {
        System.out.println("[AOP返回通知] 方法成功返回了");
    }

    @AfterThrowing(value = "execution(* com.wubai.service.*.*(..))",throwing = "tr")
    public void printLogAfterException(Throwable tr) {
        System.out.println("[AOP异常通知] 方法抛异常了");
    }

    @After(value ="pc()")
    public void printLogFinallyEnd() {
        System.out.println("[AOP后置通知] 方法最终结束了");
    }

}