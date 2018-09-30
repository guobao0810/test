package com.babycare.ribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/rubbion-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        System.out.print("客户端调用");
        return restTemplate.getForEntity("http://hello-service/init",String.class).getBody();
    }

}
