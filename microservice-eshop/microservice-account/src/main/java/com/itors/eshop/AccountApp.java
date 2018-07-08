package com.itors.eshop;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//此注解表示动态扫描DAO接口所在包
@MapperScan("com.itors.eshop.dao")
public class AccountApp {
	
	public static void main(String[] args) {
		SpringApplication.run(AccountApp.class, args);
	}
}
