package com.atguigu.spring5.facbean;

import com.atguigu.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author shkstart
 * @create 2022-03-31 9:05
 */
public class MyBean implements FactoryBean<Course>{

    //定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
