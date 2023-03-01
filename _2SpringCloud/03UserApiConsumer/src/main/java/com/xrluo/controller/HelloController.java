package com.xrluo.controller;

import com.xrluo.webFeignClient.UserApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 消费者：HelloController
 *
 * @author 莫生气
 * @date 2023/03/01
 */
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

    @RequestMapping("/2")
    public String index2() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("name", "yxz");
        map.put("gender", 1);
        Map<Object, Object> he = userApiService.getHe(map);
        return "请求成功" + he.toString();
    }


}
