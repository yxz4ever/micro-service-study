package com.xrluo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/home")
    public String home() {
        System.out.println(serverPort);
        return "Hello World！！！" + serverPort;
    }
}
