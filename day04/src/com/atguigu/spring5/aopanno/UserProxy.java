package com.atguigu.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Su
 * @create 2022-04-01 17:45
 */
//增强类
@Component
@Aspect //生成代理对象
@Order(2) //数字越小优先级越大
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value ="execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void  pointdemo(){

    }

    //前置通知
    //@Before注解表示作为前置通知
    @Before("pointdemo()")
    public void before(){
        System.out.println("before.....");
    }

    //最终通知
    @After("pointdemo()")
    public void after(){
        System.out.println("after.....");
    }

    //后置通知(返回通知)有异常不执行
    @AfterReturning("pointdemo()")
    public void afterReturning(){
        System.out.println("AfterReturning.....");
    }

    //异常通知 add()方法有异常会调用这个方法
    @AfterThrowing("execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("AfterThrowing.....");
    }

    //环绕通知
    @Around("pointdemo()")
    public void Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.....");

        //被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后.....");
    }

}
