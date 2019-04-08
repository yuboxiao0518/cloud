package com.example.service.hystrix;

import org.springframework.stereotype.Component;

import com.example.service.SchedualService;
@Component
public class SchedualServiceHystrix implements SchedualService {

	@Override
	public String homeformClientOne(String name) {
		// TODO Auto-generated method stub
		return "Sorry "+name;
	}

}
