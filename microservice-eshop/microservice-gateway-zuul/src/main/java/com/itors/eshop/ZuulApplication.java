package com.itors.eshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.itors.eshop.filter.ZuulFilterError;
import com.itors.eshop.filter.ZuulFilterPre;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
  public static void main(String[] args) {
    SpringApplication.run(ZuulApplication.class, args);
  }
  
//  @Bean
//  public ZuulFilterPre zuulFilterPre(){
//	  return new ZuulFilterPre();
//  }
//  @Bean
//  public ZuulFilterError zuulFilterError(){
//	  return new ZuulFilterError();
//  }
}
