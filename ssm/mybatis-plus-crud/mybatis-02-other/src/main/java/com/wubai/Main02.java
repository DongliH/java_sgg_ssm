package com.wubai;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.BlockAttackInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@MapperScan("com.wubai.mapper")
@SpringBootApplication
public class Main02 {
    public static void main(String[] args) {
        SpringApplication.run(Main02.class, args);//自动创建ioc容器,启动tomcat服务器
    }
    @Bean
    public MybatisPlusInterceptor plusInterceptor(){
        //mybatis 插件集合
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        //分页插件
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        //乐观锁，版本号插件

        mybatisPlusInterceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());

//        针对 update 和 delete 语句 作用: 阻止恶意的全表更新删除
//
//                添加防止全表更新和删除拦截器
        mybatisPlusInterceptor.addInnerInterceptor(new BlockAttackInnerInterceptor());
        return mybatisPlusInterceptor;
    }
}