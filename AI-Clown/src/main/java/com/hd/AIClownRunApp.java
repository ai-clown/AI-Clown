package com.hd;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AIClownRunApp {
    public static void main(String[] args) {
        SpringApplication.run(AIClownRunApp.class,args);
    }
}
