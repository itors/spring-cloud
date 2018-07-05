package com.asiainfo.feign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.asiainfo.entity.UserInfo;


@FeignClient("microservice-user")
public interface UserFeign {

	@RequestMapping(value="/login",method = RequestMethod.POST)
	public UserInfo login(UserInfo userInfo );
	
}
