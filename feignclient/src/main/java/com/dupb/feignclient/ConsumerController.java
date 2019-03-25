package com.dupb.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

    //@RequestMapping("/consumer") why not?
    //@RequestMapping(value = "consumer") is ok
    @RequestMapping("consumer")
    //@GetMapping("/consumer") is ok
    public String sayHello(@RequestParam String name){

        return consumerService.sayHello(name);
    }
}
