package com.itors.eshop.hystrix;

import org.springframework.stereotype.Component;

import com.itors.eshop.UserServer;
import com.itors.eshop.pojo.UserInfo;

/**
 * 账户  熔断处理
 *
 * @author liuming
 * @create
 */

@Component
public class UserServerHystrix implements UserServer {

	@Override
	public UserInfo login(UserInfo userInfo) {
		return null;
	}


}
