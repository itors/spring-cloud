package com.itors.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itors.eshop.pojo.UserInfo;
import com.itors.eshop.service.impl.OrderServiceImpl;

@RestController
public class OrderController {

	@Autowired
	private OrderServiceImpl orderService;
	
	@PostMapping("/login")
	public UserInfo getUser(){
		return orderService.login();
	}
}
