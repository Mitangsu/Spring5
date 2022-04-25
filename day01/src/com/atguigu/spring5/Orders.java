package com.atguigu.spring5;

/**
 * 使用有参数构造注入
 * @author shkstart
 * @create 2022-03-30 19:49
 */
public class Orders {

    private String oname;
    private String address;


    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void orderTest(){
        System.out.println(oname+":"+address);
    }
}
