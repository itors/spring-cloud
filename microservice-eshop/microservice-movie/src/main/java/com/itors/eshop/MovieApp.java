package com.itors.eshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MovieApp {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplateUser() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieApp.class, args);
	}
}
