package com.atguigu.test;

import com.atguigu.service.UserService;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Su
 * @create 2022-04-03 3:09
 */
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean1.xml")

//复合注解包括前两个
@SpringJUnitConfig(locations = "classpath:bean1.xm")
public class JTest5 {

    @Autowired
    private UserService userService;


    @Test
    public void test1(){
        userService.accountMoney();
    }


}
