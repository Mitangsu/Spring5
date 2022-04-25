package com.atguigu.dao;

import com.atguigu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

/**
 * @author Su
 * @create 2022-04-02 3:08
 */
@Repository
public interface UserDao {
    //添加的方法
    void add(User user);

    //修改的方法
    void update(User user);

    //删除的方法
    void delete(String id);

    //查询数量
    int selectCount();

    //查询对象
    User findUserInfo(String id);

    //查询所有对象集合
    List<User> findAllUser();

    //批量添加
    void findAddUser(List<Object[]> batchArgs);

    //批量修改
    void findUpdateUser(List<Object[]> batchArgs);

    //批量删除
    void findDeleteUser(List<Object[]> batchArgs);
}
