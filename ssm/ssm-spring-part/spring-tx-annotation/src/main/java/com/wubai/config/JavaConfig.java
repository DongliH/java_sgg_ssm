package com.wubai.config;


import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.wubai")
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement //开启事务注解
public class JavaConfig {
    @Value("${wubai.driver}")
    private String driver;
    @Value("${wubai.url}")
    private  String url;
    @Value("${wubai.username}")
    private String username;
    @Value("${wubai.password}")
    private String password;

    @Bean
    public DataSource dataSource(){

        DruidDataSource druidDataSource = new DruidDataSource();
//        url=jdbc:mysql://localhost:3306/studb
//        driver=com.mysql.cj.jdbc.Driver
//        username=root
//        password=666666

        druidDataSource.setUrl(url);
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return  druidDataSource;

    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return  jdbcTemplate;

    }
    @Bean
    public TransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource( dataSource);
        return dataSourceTransactionManager;
    }

}
