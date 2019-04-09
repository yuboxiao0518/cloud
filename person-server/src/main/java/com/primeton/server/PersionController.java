package com.primeton.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/person")
public class PersionController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/getPersionName")
    public String getPersionName(@RequestParam String id){
        return "name: "+id;
    }

    @GetMapping("/hi")
    public String hi(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
