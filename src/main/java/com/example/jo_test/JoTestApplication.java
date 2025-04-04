package com.example.jo_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.example.jo_test.dao")
public class JoTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoTestApplication.class, args);
    }

}
