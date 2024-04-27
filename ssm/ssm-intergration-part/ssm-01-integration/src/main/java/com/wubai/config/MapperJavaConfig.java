package com.wubai.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import javax.sql.DataSource;
import javax.security.sasl.SaslServerFactory;



//方式一 保留外部配置文件
//TODO: 如果datasource 和mybatis 组件配置在一起， value注解不生效是因为mybatis先配置 解决：分开配置

@Configuration
//读取配置类文件
public class MapperJavaConfig {

    //sqlSessionFactory加入ioc
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        //指定外部的mybatis配置文件
       Resource resource = new ClassPathResource("mybatis-config.xml");
       sqlSessionFactoryBean.setConfigLocation(resource);
        return sqlSessionFactoryBean;
    }
    //mapper代理对象加入到ioc
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){

        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //mapepr接口和mapperxml所在的共同包
        mapperScannerConfigurer.setBasePackage("com.wubai.mapper");
        return mapperScannerConfigurer;
    }
}
