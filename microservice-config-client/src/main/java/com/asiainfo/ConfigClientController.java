package com.asiainfo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
	
	@Value("${AAA}")
	private String profile;

	@GetMapping("/config")
	public String getConfig(){
		return profile;
	}

}
