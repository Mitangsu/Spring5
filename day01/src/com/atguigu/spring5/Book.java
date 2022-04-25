package com.atguigu.spring5;

/**
 * @author shkstart
 * @create 2022-03-30 19:21
 */
public class Book {
    //创建属性
    private String bname;
    private String buthor;
    private String address;

    //创建属性对应的set方法注入
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String buthor) {
        this.buthor = buthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDemo() {
        System.out.println(bname + ":" + buthor + ":" + address);
    }
}
