package com.example.spring.boot.demo.boot.spring;


import com.example.spring.boot.demo.boot.spring.model.Database;
import com.example.spring.boot.demo.boot.spring.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = "com.example.spring.boot.demo.boot.spring.model")
@EnableJpaRepositories(basePackages = "com.example.spring.boot.demo.boot.spring.repository")
public class Application {


    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

	    /*logger.trace("This is from trace");
	    logger.debug("This is from debug");*/
        logger.info("This is from info");
        logger.warn("This is from warn");
        logger.error("This is from error");

        SpringApplication.run(Application.class, args);
    }

    @Bean
    User user() {
        User user = new User();
        user.getAge();
        user.getName();
        return user;
    }

    @Bean
    Database database() {
        Database database = new Database();
        database.getName();
        database.getPort();
        return database;
    }
}
