package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


//在注解里面value属性值可以省略不写
//默认值是类名称,首字母小写
//UserService -- userService
//@Service(value = "userService") //<bean id="" class=".."/>
@Service
public class UserService {

    @Value(value = "abc")
    private String name;

    //定义dao类型属性
    //不需要添加set方法
    //@Autowired //根据类型进行注入 如果有多个实现类的对象找不到的话就在你想要的实现类上加注解并写出value值再加入 @Qualifier value相同就会匹配到
//    @Qualifier(value = "userDaoImpl1")
//    private UserDao userDao;

    //@Resource //默认是类型进行注入
    @Resource(name = "userDaoImpl1") //根据名称进行注入
    private UserDao userDao;

    public void add() {
        System.out.println("service add....."+name);
        userDao.add();
    }
}
