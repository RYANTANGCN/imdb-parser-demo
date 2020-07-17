package com.ryan.project.imdb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ryan.project.imdb.dao")
public class ImdbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImdbApplication.class, args);
    }

}
