package com.asiainfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.entity.UserInfo;
import com.asiainfo.mapper.UserInfoMapper;
import com.asiainfo.service.IUserInfoService;

@Service
public class UserInfoServiceImpl implements IUserInfoService {

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	public UserInfo getByUserid(UserInfo userInfo)  {
		
		try {
			userInfo = userInfoMapper.getByUserid(userInfo);
		} catch (Exception e) {
			userInfo=new UserInfo();
		}
		return userInfo;
	}

}
