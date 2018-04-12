package com.example.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "persion")
public class PersionController {

    @RequestMapping(value = "getPersionName")
    public String getPersionName(String id){
        return "yubx";
    }
}
