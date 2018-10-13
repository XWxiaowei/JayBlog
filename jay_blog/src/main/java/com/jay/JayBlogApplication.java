package com.jay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.jay.modules.*")
public class JayBlogApplication {

    public static void main(String[] args) {
        System.out.println("--------------启动开始-------------------");
        SpringApplication.run(JayBlogApplication.class, args);
        System.out.println("----------------启动成功-------------------");
    }
}
