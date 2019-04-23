package com.primeton.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.primeton.service.SchedualService;
import com.primeton.sys.client.controller.SysClient;

@RestController
@RequestMapping("/feign")
public class SchedualController {

	@Autowired
	private SchedualService schedualService;

	@Autowired
	private SysClient sysClient;

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHi(@RequestParam(value = "name") String name) {
		return schedualService.homeformClientOne(name);
	}

	@RequestMapping(value = "/queryLog", method = RequestMethod.GET)
	public String sayHi() {
		return schedualService.queryLog();
	}

	@RequestMapping(value = "/getmsg")
	public String getMsg() {
		return sysClient.getMsg();
	}

	@RequestMapping(value = "/queryPage")
	public String queryPage() {
		return sysClient.queryPage();
	}
}
