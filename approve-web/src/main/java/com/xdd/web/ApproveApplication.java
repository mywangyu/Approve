package com.xdd.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Deso on 2019/3/15.
 */
@SpringBootApplication
@MapperScan(basePackages = "com.xdd.data.mapper")
public class ApproveApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApproveApplication.class, args);
    }

}
