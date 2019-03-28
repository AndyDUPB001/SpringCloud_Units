package com.dupb.feignclient;

import org.springframework.stereotype.Component;

@Component
public class ConsumerServiceHiHystric implements ConsumerService{

    @Override
    public String sayHello(String name) {

        return "Hi " + name + ", Sorry, Error!";
    }
}
