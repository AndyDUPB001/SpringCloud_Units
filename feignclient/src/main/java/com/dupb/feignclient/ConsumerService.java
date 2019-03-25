package com.dupb.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-hello")
public interface ConsumerService {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    String sayHello(@RequestParam String name);

}
