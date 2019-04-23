package com.primeton.service.config;

import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;

public class MyEurekaInstanceConfig extends EurekaInstanceConfigBean {

	public MyEurekaInstanceConfig(InetUtils inetUtils) {
		super(inetUtils);
		// TODO Auto-generated constructor stub
	}

}
