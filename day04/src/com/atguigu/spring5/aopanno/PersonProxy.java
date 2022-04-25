package com.atguigu.spring5.aopanno;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Su
 * @create 2022-04-01 19:11
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {

    //后置通知(返回通知)有异常不执行
    @Before("execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("Person Before.....");
    }

}
