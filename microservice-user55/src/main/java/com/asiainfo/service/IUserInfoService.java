package com.asiainfo.service;

import com.asiainfo.entity.UserInfo;

public interface IUserInfoService {

	public UserInfo getByUserid(UserInfo userInfo)throws Exception;
}
