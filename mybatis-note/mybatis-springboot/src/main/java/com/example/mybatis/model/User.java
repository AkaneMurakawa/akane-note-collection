package com.example.mybatis.model;

import lombok.Data;

@Data
public class User {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 用户id
    */
    private String usercode;

    /**
    * 昵称
    */
    private String username;

    /**
    * 盐值
    */
    private String salt;

    /**
    * 密码hash
    */
    private String password;

    /**
    * 邮箱(登录账号)
    */
    private String email;

    /**
    * 用户性别
    */
    private String sex;

    /**
    * 头像
    */
    private String avatar;

    /**
    * 简介
    */
    private String description;

    /**
    * github
    */
    private String github;

    /**
    * twitter
    */
    private String twitter;

    /**
    * weibo
    */
    private String weibo;
}