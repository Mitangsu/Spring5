package com.atguigu.test;

import com.atguigu.config.TxConfig;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.lang.management.PlatformLoggingMXBean;

/**
 * @author Su
 * @create 2022-04-02 20:59
 */
public class TestUser {

    @Test
    public void testAccount(){

//        PlatformLoggingMXBean

        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();

    }

    @Test
    public void testAccount1(){

//        PlatformLoggingMXBean

        ApplicationContext context =
                new AnnotationConfigApplicationContext(TxConfig.class);

        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();

    }

    //函数式风格创建对象,交给spring进行管理
    @Test
    public void testAccount2(){
        //1.创建GenericApplicationContext对象
        GenericApplicationContext context =new GenericApplicationContext();
        //2.调用context的方法对象注册
        //把内容清空进行注册
        context.refresh();
        context.registerBean("user1",User.class,()->new User());
        //3.获取spring注册的对象
        User user = (User)context.getBean("user1");
        System.out.println(user);

    }



}
