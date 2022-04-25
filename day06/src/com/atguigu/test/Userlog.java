package com.atguigu.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Su
 * @create 2022-04-03 2:07
 */
public class Userlog {
    private static final Logger log= LoggerFactory.getLogger(Userlog.class);

    public static void main(String[] args) {
        log.info("hello log4j2");
        log.warn("hello log4j2");
    }
}
