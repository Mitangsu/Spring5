package com.atguigu.spring5.autowire;

/**
 * @author shkstart
 * @create 2022-03-31 21:04
 */
public class Emp {
    private Dept dept;


    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test(){
        System.out.println(dept);
    }
}
