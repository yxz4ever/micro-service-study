package com.xrluo.com.xrluo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping
    public String index() {
        System.out.println("02UserApiServer1");
        return "hello";
    }
}