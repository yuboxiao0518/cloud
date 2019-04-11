package com.primeton.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {
	/**
	 * http://localhost:8881/actuator/bus-refresh
	 */
	

	@Value("${foo}")
	private String foo;

	@RequestMapping(value = "/hi")
	public String getFoo() {
		return foo;
	}

}
