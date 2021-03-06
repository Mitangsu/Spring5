package com.atguigu.spring5.test;

import com.atguigu.spring5.aopanno.User;
import com.atguigu.spring5.aopxml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Su
 * @create 2022-04-01 18:01
 */
public class TestAop {

    @Test
    public void testAopAno(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testXml(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
