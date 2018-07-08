package com.itors.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.itors.eshop.service.impl.AccountServiceImpl;

@RestController
public class UserController {

	@Autowired
	private AccountServiceImpl accountService;
	

}
