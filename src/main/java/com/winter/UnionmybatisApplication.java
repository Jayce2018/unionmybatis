package com.winter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;


@SpringBootApplication
@MapperScan("com.winter.mapper")



public class UnionmybatisApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(UnionmybatisApplication.class, args);
    }
}
