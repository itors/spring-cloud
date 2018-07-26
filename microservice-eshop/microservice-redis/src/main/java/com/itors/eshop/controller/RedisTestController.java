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
public class RedisTestController {
	private final Logger logger = Logger.getLogger(getClass());
	 
	@Autowired
	private RedisTemplate redisTemplate;
	
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
//		 //从缓存中获取城市信息
//        String key = name;
//        ValueOperations<String, String> operations = redisTemplate.opsForValue();
//        //缓存存在
//        boolean hasKey = redisTemplate.hasKey(key);
//        if (hasKey) {
//        	String userName = operations.get(key);
//        	logger.info(" 从缓存中获取了姓名 >> " + userName);
//            return userName;
//		}
//        //缓存不存在，将数据存入缓存
//        operations.set("city", name, 100000, TimeUnit.SECONDS);
//        logger.info("CityServiceImpl.findCityById() : 城市插入缓存 >>  " +name);
		
		boolean flag = redisHandle.exists(name);
		if(flag){
			return (String)redisHandle.get(name);
		}else{
			redisHandle.set(name, "Welcome: redis");
		}
    	return "redis ";
    }
}