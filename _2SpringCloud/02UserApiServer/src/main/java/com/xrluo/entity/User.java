package com.xrluo.entity;


import lombok.Data;

/**
 * 用户
 *
 * @author 莫生气
 * @date 2023/03/01
 */
@Data
public class User {
    /** id */
    private Integer id;
    /** 名字 */
    private String name;
    /** 性别 */
    private Short gender;
}
