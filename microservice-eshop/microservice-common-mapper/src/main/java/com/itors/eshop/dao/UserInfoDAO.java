package com.itors.eshop.dao;

import com.itors.eshop.pojo.UserInfo;

public interface UserInfoDAO {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo login(Integer userId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}