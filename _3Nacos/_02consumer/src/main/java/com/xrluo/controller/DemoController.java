package com.xrluo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String getDiscovery() {
        return restTemplate.getForObject("http://ProvideService/home", String.class);
    }
}
