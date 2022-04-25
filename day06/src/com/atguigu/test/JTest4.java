package com.atguigu.test;

import com.atguigu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Su
 * @create 2022-04-03 3:09
 */
@RunWith(SpringJUnit4ClassRunner.class)//指定单元测试框架版本
@ContextConfiguration("classpath:bean1.xml")//加载配置文件
public class JTest4 {

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.accountMoney();
    }

}
