package com.itors.eshop;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.itors.eshop.hystrix.OrderServerHystrix;

@FeignClient(value = "orderServer", fallback = OrderServerHystrix.class)
public interface OrderServer {
	
}
