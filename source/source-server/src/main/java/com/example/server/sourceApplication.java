package com.example.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.example.server.mapper")
public class sourceApplication {
    public static void main(String[] args){
        SpringApplication.run(sourceApplication.class,args);
    }
}
