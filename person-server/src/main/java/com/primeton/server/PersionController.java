package com.primeton.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.primeton.appframe.common.utils.RedisUtil;

@RestController
@RequestMapping(value = "/person/")
public class PersionController {

	@Value("${server.port}")
	String port;

	@Autowired
	private RedisUtil redisUtil;

	@RequestMapping(value = "setData")
	public void setData(@RequestParam(value = "data", defaultValue = "yubx") String data) {
		redisUtil.set("name", data);
	}

	@RequestMapping(value = "getData")
	public String getData(@RequestParam(value = "key") String key) {
		return "key: "+redisUtil.get(key).toString();
	}

	@RequestMapping(value = "getPersionName")
	public String getPersionName(@RequestParam String id) {
		return "name: " + id;
	}

	@GetMapping("hi")
	public String hi(@RequestParam(value = "name", defaultValue = "yubx") String name) {
		return "hi " + name + ",i am from port:" + port;
	}
}
