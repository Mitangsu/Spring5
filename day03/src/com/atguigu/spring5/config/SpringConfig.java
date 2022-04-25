package com.atguigu.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Su
 * @create 2022-04-01 1:32
 */
@Configuration //作为配置类,替代xml配置文件
@ComponentScan(basePackages = {"com.atguigu"}) //组件扫描
public class SpringConfig {
}
