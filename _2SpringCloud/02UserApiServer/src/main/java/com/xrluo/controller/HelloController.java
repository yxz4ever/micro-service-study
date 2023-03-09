package com.xrluo.controller;

import com.xrluo.entity.vo.UserVo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务者：HelloController
 *
 * @author 莫生气
 * @date 2023/03/01
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/he")
    public String index() {
        System.out.println("02UserApiServer");
        return "hello";
    }

    /**
     * 获取用户信息
     *
     * @param userVo 用户参数
     *
     * @return {@code UserVo}
     */
    @PostMapping("/he2")
    public UserVo index2(@RequestBody UserVo userVo) {
        System.out.println("获取到的用户信息：" + userVo);
        userVo.setName(userVo.getName() + System.currentTimeMillis());
        return userVo;
    }

    @RequestMapping
    public String index3(HttpServletRequest httpRequest) {
        return "端口号为：" + httpRequest.getServerPort();
    }
}
