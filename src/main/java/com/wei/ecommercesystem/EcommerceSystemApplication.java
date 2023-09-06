package com.wei.ecommercesystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.wei.ecommercesystem.db.mappers")
@ComponentScan(basePackages = {"com.wei"})
public class EcommerceSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceSystemApplication.class, args);
//        ConfigurableApplicationContext context = SpringApplication.run(EcommerceSystemApplication.class, args);
//        DatabaseService databaseService = context.getBean(DatabaseService.class);
//        databaseService.checkDatabaseConnection();
    }

}
