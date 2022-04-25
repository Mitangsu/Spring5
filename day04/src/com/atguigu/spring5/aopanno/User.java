package com.atguigu.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author Su
 * @create 2022-04-01 17:44
 */
//被增强类
@Component
public class User {
    public void add(){
        System.out.println("add.....");
    }
}
