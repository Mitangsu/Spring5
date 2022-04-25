package com.atguigu.spring5.bean;

/**
 * @author shkstart
 * @create 2022-03-30 20:54
 */
//部门类
public class Dept {

    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return dname;

    }
}
