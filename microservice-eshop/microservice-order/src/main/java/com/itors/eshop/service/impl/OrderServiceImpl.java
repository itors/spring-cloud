package com.itors.eshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.itors.eshop.UserServer;
import com.itors.eshop.pojo.UserInfo;
import com.itors.eshop.service.IOrderService;

public class OrderServiceImpl implements IOrderService{

	@Autowired
	private UserServer userServer;
	@Override
	public UserInfo login() {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(111);
		userInfo.setUserName("ABC");
		return userServer.login(userInfo);
	}

}
