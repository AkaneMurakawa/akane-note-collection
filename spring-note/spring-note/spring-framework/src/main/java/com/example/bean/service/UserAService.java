package com.example.bean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 循环依赖问题
 */
@Service("userA")
public class UserAService {

    @Autowired
    @Qualifier("userB")
    public UserBService userBService;

    public UserAService() {
        System.out.println("userA construct");
    }
}


