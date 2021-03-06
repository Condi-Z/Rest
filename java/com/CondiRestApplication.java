package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.condi.dao, com.condi")
@SpringBootApplication
public class CondiRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CondiRestApplication.class, args);
    }

}
