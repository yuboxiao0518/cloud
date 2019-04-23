package com.primeton.server;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String getName(String name) {
        return restTemplate.getForObject("http://person-server/person/getPersionName?id="+name,String.class);
    }
    public String hi(String name) {
        return restTemplate.getForObject("http://person-server/person/hi?name="+name,String.class);
    }
    
    public String getmsg() {
    	return restTemplate.getForObject("http://sys-server/sys/msg", String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
