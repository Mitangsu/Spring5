package com.atguigu.spring5.bean;

/**
 * @author shkstart
 * @create 2022-03-31 19:13
 */
public class Orders {

    //无参数构造
    public Orders() {
        System.out.println("第一步,执行无参数构造创建bean实例");
    }

    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步,调用set方法设置属性值");
    }

    //创建执行的初始化方法 //xml配置文件bean标签加上init-method="initMethod"
    public void initMethod(){
        System.out.println("第三步,执行初始化的方法");

    }

    //创建执行的销毁方法 //xml配置文件bean标签加上destroy-method="destroyMethod"
    public void destroyMethod(){
        System.out.println("第五步,执行初始化的方法");

    }

}
