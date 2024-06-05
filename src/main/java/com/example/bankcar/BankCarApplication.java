package com.example.bankcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"login.*","driverLicense.*","car.*"})
@EntityScan(basePackages = {"login.dto","driverLicense.entity","car.entity"})
@EnableJpaRepositories(basePackages = {"login.dao","driverLicense.repo","car.repo"})
public class BankCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankCarApplication.class, args);
    }

}
