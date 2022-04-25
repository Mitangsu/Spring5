package com.atguigu.spring5.collectiontype;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-03-30 22:56
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test(){
        System.out.println(list);
    }

}
