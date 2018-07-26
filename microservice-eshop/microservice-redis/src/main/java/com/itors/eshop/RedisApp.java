package com.itors.eshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RedisApp {
	
	public static void main(String[] args) {
		SpringApplication.run(RedisApp.class, args);
	}
}
