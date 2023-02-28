package com.xrluo.controller;

import com.xrluo.webFeignClient.UserApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class HelloController {

    @Autowired
    private UserApiService userApiService;

    @RequestMapping
    public String index() {
        String hello = userApiService.hello();
        return "请求成功" + hello;
    }
}
