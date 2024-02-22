package com.sy.myboardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MyBoardServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBoardServiceApplication.class, args);
    }

}
