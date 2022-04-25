package com.atguigu.spring5.collectiontype;

/**
 * @author shkstart
 * @create 2022-03-30 22:37
 */
public class Course {
    private  String cname;//课程名称

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}




