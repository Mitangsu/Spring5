package com.atguigu.spring5.DAO.impl;

import com.atguigu.spring5.DAO.UserDao;

/**
 * @author shkstart
 * @create 2022-03-30 20:31
 */
public class UserDaoImpl implements UserDao{

    @Override
    public void update() {
        System.out.println("dao update.....");
    }
}
