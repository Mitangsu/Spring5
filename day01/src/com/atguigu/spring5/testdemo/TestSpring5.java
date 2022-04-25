package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2022-03-30 10:27
 */
public class TestSpring5 {

    @Test
    public void testAdd(){
        //1.加载Sphring的配置文件 BeanFactory懒汉式 ApplicationContext饿汉式
        //FileSystemXmlApplicationContext绝对路径
        //ClassPathXmlApplicationContext相对路径
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook1(){
        //1.加载spring配置文件
        ApplicationContext context =new ClassPathXmlApplicationContext("bean1.xml");

        //2获取配置创建的对象
        Book book = context.getBean("book", Book.class);

        System.out.println(book);
        book.testDemo();


    }

    @Test
    public void testOrder(){
        //1.加载spring配置文件
        ApplicationContext context =new ClassPathXmlApplicationContext("bean1.xml");

        //2获取配置创建的对象
        Orders order = context.getBean("order", Orders.class);

        System.out.println(order);
        order.orderTest();
    }
}

























