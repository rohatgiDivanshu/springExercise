package com.divanshu.rest.rest.with.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.divanshu.rest.rest.with.spring.repository")
@EntityScan(basePackages = "com.divanshu.rest.rest.with.spring.entity")
public class Application {


	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}
}
