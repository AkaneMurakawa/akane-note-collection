package com.example.bean.factory;

import com.example.ioc.dependency.domain.User;

/**
 * 工厂类
 */
public class UserFactory {

    public User createUser(){
        User user = new User();
        user.setName("Akane Factory");
        return user;
    }
}
