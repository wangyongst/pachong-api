package com.boot.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BHWL on 2017-08-09.
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.myweb.dao.jpa"})
@ComponentScan(basePackages = {"com.myweb"})
@EntityScan(basePackages = {"com.myweb.pojo"})
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
