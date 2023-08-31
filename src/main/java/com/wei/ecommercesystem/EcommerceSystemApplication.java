package com.wei.ecommercesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EcommerceSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceSystemApplication.class, args);
//        ConfigurableApplicationContext context = SpringApplication.run(EcommerceSystemApplication.class, args);
//        DatabaseService databaseService = context.getBean(DatabaseService.class);
//        databaseService.checkDatabaseConnection();
    }

}
