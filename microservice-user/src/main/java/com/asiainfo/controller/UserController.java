package com.asiainfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asiainfo.entity.UserInfo;
import com.asiainfo.service.impl.UserInfoServiceImpl;

@RestController
public class UserController {

	@Autowired
	private UserInfoServiceImpl userInfoService;

	@PostMapping(value = "/login")
	public UserInfo login(@RequestBody UserInfo userInfo) {
		userInfo = userInfoService.getByUserid(userInfo);
		return userInfo;
	}

	@RequestMapping(value = "/simple/{id}")
	public String findById(@PathVariable String id) {
		return id;
	}
	@PostMapping(value = "/testPost")
	public String testPost( String userName) {
		return userName;
	}
	
}
