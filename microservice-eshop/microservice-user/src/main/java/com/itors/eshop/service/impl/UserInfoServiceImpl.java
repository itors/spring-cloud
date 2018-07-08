package com.itors.eshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itors.eshop.dao.UserInfoMapper;
import com.itors.eshop.pojo.UserInfo;
import com.itors.eshop.service.IUserInfoService;
/**
 * 用户业务类
 * @author itors
 * 2018.07.06
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService{
	@Autowired
	private UserInfoMapper userDao;
	
	public UserInfo loginDo(UserInfo userInfo){
		return userDao.selectByPrimaryKey(userInfo.getUserId());
	}
}
