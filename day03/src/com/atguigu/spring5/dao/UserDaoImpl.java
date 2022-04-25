package com.atguigu.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Su
 * @create 2022-04-01 0:52
 */
@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("Dao add.....");
    }
}
