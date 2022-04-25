package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.bean.Emp;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2022-03-30 20:45
 */
public class TestBean {
    @Test
    public void testBean(){
        //1.加载Sphring的配置文件 BeanFactory懒汉式 ApplicationContext饿汉式
        //FileSystemXmlApplicationContext绝对路径
        //ClassPathXmlApplicationContext相对路径
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //2.获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    @Test
    public void testBean1(){
        //1.加载Sphring的配置文件 BeanFactory懒汉式 ApplicationContext饿汉式
        //FileSystemXmlApplicationContext绝对路径
        //ClassPathXmlApplicationContext相对路径
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        //2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        emp.add();
    }

}
