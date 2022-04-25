package com.atguigu.service;


import com.atguigu.dao.UserDao;
import com.atguigu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Su
 * @create 2022-04-02 3:08
 */
@Service
public class UserService {


    //注入dao
    @Autowired
    private UserDao userDao;

    //添加的方法
    public void addUser(User user){
        userDao.add(user);
    }

    //修改的方法
    public void updateUser(User user){
        userDao.update(user);
    }

    //删除的方法
    public void deleteUser(String id){
        userDao.delete(id);
    }

    //查询表记录数
    public int findCount(){
        return userDao.selectCount();
    }

    //查询对象
    public User findOne(String id){
        return userDao.findUserInfo(id);
    }

    //查询对象
    public List<User> findAll(){
        return userDao.findAllUser();
    }

    //批量添加
    public void batchAdd(List<Object[]> batchArgs){
        userDao.findAddUser(batchArgs);
    }

    //批量修改
    public void batchUpdate(List<Object[]> batchArgs){
        userDao.findUpdateUser(batchArgs);
    }

    //批量删除
    public void batchDelete(List<Object[]> batchArgs){
        userDao.findDeleteUser(batchArgs);
    }
}










