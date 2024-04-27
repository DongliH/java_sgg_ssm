package com.wubai.config;


//连接池配置类

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
@Configuration
@PropertySource("classpath:jdbc.properties")
public class DataSourceJavaConfig {

    @Value("${wubai.username}")
    private String username;
    @Value("${wubai.password}")
    private String password;
    @Value("${wubai.url}")
    private String url;
    @Value("${wubai.driver}")
    private String driver;

    //将连接池加入ioc容器
    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        druidDataSource.setUrl(url);
        druidDataSource.setDriverClassName(driver);
        return druidDataSource;
    }

}
