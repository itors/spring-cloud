package com.itors.eshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itors.eshop.dao.AccountMapper;
import com.itors.eshop.service.AccountService;
/**
 * 用户业务类
 * @author icode
 * 2018.07.06
 */
@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountMapper accountDao;
	
}
