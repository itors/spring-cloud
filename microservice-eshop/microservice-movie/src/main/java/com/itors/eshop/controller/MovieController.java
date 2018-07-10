package com.itors.eshop.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.itors.eshop.entity.UserInfo;
import com.itors.eshop.feign.UserFeign;

@RestController
public class MovieController {

	private Logger logger = Logger.getLogger(getClass());

	@Autowired
	private RestTemplate restTemplateUser;
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	@Autowired
	private UserFeign userFeign;

	@GetMapping("/movie/{id}")
	public String findById(@PathVariable Long id) {
		// http://localhost:7900/simple/
		// VIP virtual IP
		ServiceInstance serviceInstance = this.loadBalancerClient.choose("userServer");
		 System.out.println("===" + ":" + serviceInstance.getServiceId() + ":"
		 + serviceInstance.getHost() + ":" + serviceInstance.getPort());
		return this.restTemplateUser.getForObject("http://userServer/simple/" + id, String.class);
	}

	@GetMapping("/test")
	public String test() {
		ServiceInstance serviceInstance = this.loadBalancerClient.choose("userServer");
		System.out.println("111" + ":" + serviceInstance.getServiceId() + ":" + serviceInstance.getHost() + ":"
				+ serviceInstance.getPort());
		return "1";
	}

	@PostMapping(value = "/login")
	public UserInfo login( UserInfo userInfo) {
		logger.debug("用户名"+userInfo.getUserName());
		userInfo = userFeign.login(userInfo);
		return userInfo;
	}
	@PostMapping(value = "/testPost")
	public String testPost( String userName) {
		return userName;
	}

}
