package com.itors.eshop;


import org.springframework.cloud.netflix.feign.FeignClient;

import com.itors.eshop.hystrix.AccountServerHystrix;

/**
 * 账户相关服务
 *
 * @author itors
 * @create
 */

@FeignClient(value = "accountServer", fallback = AccountServerHystrix.class)
public interface AccountServer {

    


}
