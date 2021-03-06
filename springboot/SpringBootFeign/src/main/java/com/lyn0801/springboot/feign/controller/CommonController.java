package com.lyn0801.springboot.feign.controller;

import com.lyn0801.springboot.feign.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "feign")
public class CommonController {
    @Autowired
    private CommonService commonService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String getHello(String name){
        return "Hello " + name + ", this is Hello controller.";
    }

    @RequestMapping(value = "hello1", method = RequestMethod.GET)
    public String getHelloFeign(){
        return commonService.getPort();
    }


}
