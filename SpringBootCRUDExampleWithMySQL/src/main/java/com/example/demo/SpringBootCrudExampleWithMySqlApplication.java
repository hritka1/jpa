package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.demo"})
@EnableAutoConfiguration
public class SpringBootCrudExampleWithMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudExampleWithMySqlApplication.class, args);
	}

}