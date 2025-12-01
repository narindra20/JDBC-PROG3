package com.example.demo;

import com.example.demo.service.JdbcService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private final JdbcService jdbcService;

    public DemoApplication(JdbcService jdbcService) {
        this.jdbcService = jdbcService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        jdbcService.testConnection();
    }
}
