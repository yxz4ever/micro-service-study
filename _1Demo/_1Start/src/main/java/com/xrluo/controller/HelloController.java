package com.xrluo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 你好控制器
 *
 * @author 莫生气
 * @date 2023/02/21
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/*")
    public String say() {
        return "Hello World!!!";
    }

    @RequestMapping("/say")
    public String say2() {
        return "Hello World 2!!!";
    }
}
