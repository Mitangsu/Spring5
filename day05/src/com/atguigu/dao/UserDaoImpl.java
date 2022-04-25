package com.atguigu.dao;

import com.atguigu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;

/**
 * @author Su
 * @create 2022-04-02 3:08
 */
@Repository
public class UserDaoImpl implements  UserDao {


    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(User user) {
        //1.创建sql语句
        String sql="insert into t_user values(?,?,?)";
        //2.调用方法实现
        Object[] args ={user.getUserId(), user.getUsername(), user.getUstatus()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println("添加成功添加了"+update+"条数据");


    }

    @Override
    public void update(User user) {
        int update = jdbcTemplate.update("update t_user set username=?,ustatus=? where user_id=?", user.getUsername(),user.getUstatus(),user.getUserId());
        System.out.println("修改成功改变了"+update+"条数据");
    }


    @Override
    public void delete(String id) {
        int update = jdbcTemplate.update("delete from t_user where user_id=?", id);
        System.out.println("删除成功并且改变了"+update+"条数据");
    }


    @Override
    public int selectCount() {
        Integer count = jdbcTemplate.queryForObject("select count(*) from t_user", Integer.class);
        return count;
    }

    @Override
    public User findUserInfo(String id) {
        User user = jdbcTemplate.queryForObject("select * from t_user where user_id=?", new BeanPropertyRowMapper<User>(User.class), id);
        return user;
    }

    @Override
    public List<User> findAllUser() {
        List<User> query = jdbcTemplate.query("select * from t_user", new BeanPropertyRowMapper<User>(User.class));
        return query;
    }

    @Override
    public void findAddUser(List<Object[]> batchArgs) {
        String sql="insert into t_user values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void findUpdateUser(List<Object[]> batchArgs) {
        int[] ints = jdbcTemplate.batchUpdate("update t_user set username=?,ustatus=? where user_id=?", batchArgs);
        System.out.println(Arrays.toString(ints));

    }

    @Override
    public void findDeleteUser(List<Object[]> batchArgs) {
        int[] ints = jdbcTemplate.batchUpdate("delete from t_user where user_id=?", batchArgs);
        System.out.println(Arrays.toString(ints));

    }


}





















