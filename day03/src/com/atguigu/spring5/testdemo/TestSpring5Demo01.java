package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.config.SpringConfig;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Su
 * @create 2022-04-01 0:04
 */
public class TestSpring5Demo01 {

    @Test
    public void testService1(){
        //1.加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        UserService userService = context.getBean("userService", UserService.class);

        System.out.println(userService);
        userService.add();


    }

    @Test
    public void testService2(){
        //1.加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService userService = context.getBean("userService", UserService.class);

        System.out.println(userService);
        userService.add();


    }
}
