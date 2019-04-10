package com.primeton.service.hystrix;

import org.springframework.stereotype.Component;

import com.primeton.service.SchedualService;
@Component
public class SchedualServiceHystrix implements SchedualService {

	@Override
	public String homeformClientOne(String name) {
		// TODO Auto-generated method stub
		return "Sorry "+name;
	}

	@Override
	public String queryLog() {
		// TODO Auto-generated method stub
		return null;
	}

}
