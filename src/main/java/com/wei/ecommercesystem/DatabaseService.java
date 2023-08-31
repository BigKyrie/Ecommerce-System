package com.wei.ecommercesystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @program: Ecommerce-System
 * @description:
 * @author: Yuheng Wei
 * @create: 2023-08-31 00:24
 */
@Service
public class DatabaseService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DatabaseService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void checkDatabaseConnection() {
        String query = "SELECT 1";
        Integer result = jdbcTemplate.queryForObject(query, Integer.class);
        if (result != null && result == 1) {
            System.out.println("Database connection is successful.");
        } else {
            System.out.println("Database connection failed.");
        }
    }
}
