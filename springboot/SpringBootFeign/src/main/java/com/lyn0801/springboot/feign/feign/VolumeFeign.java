package com.lyn0801.springboot.feign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("eureka-client")
@RequestMapping("hello")
public interface VolumeFeign {

    @RequestMapping(value = "port", method = RequestMethod.GET)
    String getPort();
}
