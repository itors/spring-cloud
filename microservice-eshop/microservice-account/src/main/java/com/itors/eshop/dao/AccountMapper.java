package com.itors.eshop.dao;

import com.itors.eshop.pojo.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer accId);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer accId);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}