package com.xrluo.webFeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@FeignClient("UserApiServer")
public interface UserApiService {
    @RequestMapping("/hello")
    String hello();

    @PostMapping("/hello/he2")
    Map<Object, Object> getHe(HashMap<String, Object> map);

}
