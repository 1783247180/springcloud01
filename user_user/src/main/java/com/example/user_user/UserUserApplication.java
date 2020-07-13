package com.example.user_user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCaching
@MapperScan("com.example.user_common.mapper")
public class UserUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserUserApplication.class, args);
    }

}
