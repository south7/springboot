package com.wangfan.springboot.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.wangfan.springboot.mybatis.mapper")
@EnableTransactionManagement//开启事物注解驱动支持
public class AppConfig2 {
    public static void main(String[] args) {
        SpringApplication.run(AppConfig2.class,args);
    }
}
