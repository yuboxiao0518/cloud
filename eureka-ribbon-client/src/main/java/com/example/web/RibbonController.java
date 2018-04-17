package com.example.web;

import com.example.controller.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String helloConeumer(){
        return ribbonService.hi("yubx");
    }
}
