package com.dupb.ribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.concurrent.ExecutionException;

@RestController
public class ConsumerController {

    /*@Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/consumer")
    public String helloConsumer() throws ExecutionException , InterruptedException {

        ServiceInstance instance = loadBalancerClient.choose("providers");
        URI uri = URI.create(String.format("http://%s:%s", instance.getHost(), instance.getPort()));

        return uri.toString();
    }*/
    @Autowired
    ConsumerService consumerService;

    @RequestMapping("/consumer")
    public String helloConsumer(@RequestParam String name) {

        return consumerService.helloConsumer(name);
    }
}
