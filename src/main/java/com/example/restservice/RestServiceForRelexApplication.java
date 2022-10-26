package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RestServiceForRelexApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestServiceForRelexApplication.class, args);
    }

}
