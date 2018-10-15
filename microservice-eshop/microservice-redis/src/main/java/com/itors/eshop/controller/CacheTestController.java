package com.itors.eshop.controller;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itors.eshop.cache.impl.RedisHandle;

@RestController
public class CacheTestController {
	private final Logger logger = Logger.getLogger(getClass());
	 
	
	@Autowired
	private RedisHandle redisHandle;
	
    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
       
        Integer r = a + b;
        logger.info("/add, result:" + r);
        return r;
    }
    
	@GetMapping("/hello")
    public String sayHi(@RequestParam String name){
		
		boolean flag = redisHandle.exists(name);
		if(flag){
			return (String)redisHandle.get(name);
		}else{
			redisHandle.set(name, "Welcome: redis");
		}
    	return "redis ";
    }
}