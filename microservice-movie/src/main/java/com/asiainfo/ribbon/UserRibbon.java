package com.asiainfo.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

public class UserRibbon {

	  @Autowired
	  private LoadBalancerClient loadBalancerClient;
	
}
