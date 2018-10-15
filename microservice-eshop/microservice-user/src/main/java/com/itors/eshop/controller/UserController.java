package com.itors.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.itors.eshop.pojo.UserInfo;
import com.itors.eshop.service.impl.UserInfoServiceImpl;

@RestController
public class UserController {

	@Autowired
	private UserInfoServiceImpl userInfoService;
	
	@ResponseBody
	@PostMapping("/login")
	public Object login(){
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(100001);
		return userInfoService.login(userInfo);
				
	}
	@GetMapping("/test")
	public Object loadBlanceTest(){
		System.out.println("serServer 1:request is comming....");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			 System.out.println("线程被打断... " + e.getMessage());
			e.printStackTrace();
		}
		return "this userServer 1";
	}

}
