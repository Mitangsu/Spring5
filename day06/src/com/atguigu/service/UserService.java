package com.atguigu.service;

import com.atguigu.dao.UserDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Su
 * @create 2022-04-02 20:47
 */
@Service
@Transactional(readOnly = false,timeout = -1,propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
public class UserService {

    //注入Dao
    @Resource
    private UserDao userDao;

    //转账的方法
    public void accountMoney(){

//        try{
            //第一步开启事务

            //第二步进行业务操作

            int i = 10/0;

            userDao.addMoney();

            //第三步,没有发生异常,提交事务

//        }catch (Exception e){
//            //第四步,出现异常回滚


//        }


    }

}
