package com.dupb.ribbonclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand( fallbackMethod = "helloError")
    public String helloConsumer(String name) {

        return restTemplate.getForObject("http://SERVICE-HELLO/hello?name=" + name, String.class);
    }

    public String helloError(String name) {

        return "Hi " + name + ", Sorry, Error!";
    }
}
