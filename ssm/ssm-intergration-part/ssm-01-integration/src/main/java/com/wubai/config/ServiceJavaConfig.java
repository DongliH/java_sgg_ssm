package com.wubai.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.concurrent.atomic.DoubleAccumulator;

@Configuration
//开启aop注解的支持
@EnableAspectJAutoProxy
//开启事务注解支持
@EnableTransactionManagement
//yongbuzhao?
@ComponentScan("com.wubai.service")
public class ServiceJavaConfig {

    @Bean
    public TransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource( dataSource);
        return dataSourceTransactionManager;
    }
}
