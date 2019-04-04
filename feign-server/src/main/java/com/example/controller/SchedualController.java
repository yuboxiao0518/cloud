package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.SchedualService;

@RestController
@RequestMapping("/feign")
public class SchedualController {

	@Autowired
	private SchedualService schedualService;

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHi(@RequestParam(value = "name") String name) {
		return schedualService.homeformClientOne(name);
	}

}
