package com.atguigu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author Su
 * @create 2022-04-03 0:42
 */
@Configuration //配置类
@ComponentScan(basePackages ="com.atguigu")//组件扫描
@EnableTransactionManagement //开启事务
public class TxConfig {

    //创建数据库的连接池
    @Bean
    public DruidDataSource getDruidDateSource(){
        DruidDataSource druidDataSource =new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql:///user_db");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("120074111");
        return druidDataSource;
    }

    //创建JdbcTemplate对象
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        //到 ioc 容器中根据类型找到 dataSource
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //注入 dataSource
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;

    }

    //创建事务管理器
    @Bean
    public DataSourceTransactionManager getDDataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager =new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return  transactionManager;
    }



}



















