package com.itors.eshop;



import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itors.eshop.hystrix.UserServerHystrix;
import com.itors.eshop.pojo.UserInfo;

/**
 * 用户相关服务
 *
 * @author itors
 * @create
 */

@FeignClient(value = "userServer", fallback = UserServerHystrix.class)
public interface UserServer {

	@RequestMapping(value="/login",method = RequestMethod.POST)
	public UserInfo login(UserInfo userInfo );


}
