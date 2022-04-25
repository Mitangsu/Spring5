package com.atguigu.spring5;

/**
 * @author Su
 * @create 2022-04-01 11:44
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了");
        return id;
    }
}
