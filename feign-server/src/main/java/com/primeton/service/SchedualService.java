package com.primeton.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.primeton.service.hystrix.SchedualServiceHystrix;

@FeignClient(value = "person-server",fallback=SchedualServiceHystrix.class)
public interface SchedualService {

	@RequestMapping(value = "/person/hi", method = RequestMethod.GET)
	String homeformClientOne(@RequestParam(value = "name") String name);
	
	@RequestMapping(value="/admin/log/queryPage",method=RequestMethod.GET)
	String queryLog();

}
