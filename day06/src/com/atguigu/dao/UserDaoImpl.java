package com.atguigu.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author Su
 * @create 2022-04-02 20:48
 */
@Repository
public class UserDaoImpl implements UserDao{


    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public void reduceMoney() {
        String sql="update u_account set money=money-? where username = ?";
        jdbcTemplate.update(sql,100,"lucy");
    }

    @Override
    public void addMoney() {
        String sql="update u_account set money=money+? where username = ?";
        jdbcTemplate.update(sql,100,"mary");

    }


}
