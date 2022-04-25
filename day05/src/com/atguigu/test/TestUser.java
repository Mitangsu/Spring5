package com.atguigu.test;

import com.atguigu.entity.User;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Su
 * @create 2022-04-02 3:48
 */
public class TestUser {

    @Test
    public void testJdbcTemplate(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        UserService userService = context.getBean("userService", UserService.class);

//        User user = new User();
//        user.setUserId("2");
//        user.setUsername("张三");
//        user.setUstatus("哒哒哒");

          //添加
//        userService.addUser(user);

//        User user = new User();
//        user.setUserId("2");
//        user.setUsername("张四");
//        user.setUstatus("哒哒哒");

          //修改
//        userService.updateUser(user);

//        User user = new User();
//        user.setUserId("2");
//        user.setUsername("张四");
//        user.setUstatus("哒哒哒");

          //删除
//        userService.deleteUser("2");

//        //查询返回数
//        int count = userService.findCount();
//        System.out.println(count);

//        //返回对象
//        User user = userService.findOne("1");
//        System.out.println(user);

//        //查询所有值
//        List<User> userList = userService.findAll();
//        userList.forEach(System.out::println);

//        //批量添加
//        ArrayList<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 ={"3","java","a"};
//        Object[] o2 ={"4","c","b"};
//        Object[] o3 ={"5","c++","c"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//
//        //调用批量添加
//        userService.batchAdd(batchArgs);

//        //批量修改
//        ArrayList<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 ={"java1","aa","3"};
//        Object[] o2 ={"c#","bb","4"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//
//        //调用方法
//        userService.batchUpdate(batchArgs);

        //批量删除
        ArrayList<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 ={"3"};
        Object[] o2 ={"4"};
        Object[] o3 ={"5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);

        userService.batchDelete(batchArgs);


    }
}
















