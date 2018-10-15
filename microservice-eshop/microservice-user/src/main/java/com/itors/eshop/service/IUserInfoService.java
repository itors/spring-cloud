package com.itors.eshop.service;

import com.itors.eshop.pojo.UserInfo;

public interface IUserInfoService {
	
	public UserInfo login(UserInfo userInfo) throws Exception;

}
