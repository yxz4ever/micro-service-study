package com.xrluo.webFeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("UserApiServer")
public interface UserApiService {
    @RequestMapping("/hello")
    String hello();

}
