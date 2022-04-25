package com.atguigu.spring5.bean;

/**
 * @author shkstart
 * @create 2022-03-30 20:54
 */
//员工类
public class Emp {
    private String ename;
    private String gender;
    //员工属于某一个部门,使用对象形式表示
    private Dept dept;

    //生成dept的get方法
    public Dept getDept() {
        return dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void add(){
        System.out.println(ename+"::"+gender+"::"+dept);
    }
}
