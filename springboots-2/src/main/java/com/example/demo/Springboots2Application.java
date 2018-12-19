package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;


//@EnableAutoConfiguration
@ComponentScan("com.example")
@MapperScan("com.example.dao")
@EnableCaching
@SpringBootApplication
public class Springboots2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboots2Application.class, args);
	}

}

