package com.example.bean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 循环依赖问题
 */
@Service("userB")
public class UserBService {

    @Autowired
    @Qualifier("userA")
    public UserAService userAService;

    public UserBService() {
        System.out.println("userB construct");
    }
}


