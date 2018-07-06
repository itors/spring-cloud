package com.asiainfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.asiainfo.dao.userInfoMapper;
import com.asiainfo.pojo.UserInfo;
import com.asiainfo.service.UserInfoService;
/**
 * 用户业务类
 * @author lijl
 * 2018.07.06
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{
	@Autowired
	private userInfoMapper userDao;
	
	public UserInfo loginDo(UserInfo userInfo){
		return userDao.selectByPrimaryKey(userInfo.getUserId());
	}
}
