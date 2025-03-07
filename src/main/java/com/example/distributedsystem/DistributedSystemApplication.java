package com.example.distributedsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DistributedSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(DistributedSystemApplication.class, args);
    }
} 