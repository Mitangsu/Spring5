package com.atguigu.spring5.service;

import com.atguigu.spring5.DAO.UserDao;

/**
 * @author shkstart
 * @create 2022-03-30 20:30
 */
public class UserService {

    //创建UserDao类型属性,生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add............");
        userDao.update();

        //创建UserDAO对象(原始方式)
//        UserDao userDao =new UserDaoImpl();
//        userDao.update();

        //

    }
}
