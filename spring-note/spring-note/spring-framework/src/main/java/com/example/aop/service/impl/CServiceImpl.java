package com.example.aop.service.impl;

import com.example.aop.service.CService;
import org.springframework.stereotype.Service;

@Service
public class CServiceImpl implements CService {

    @Override
    public void dosomething() {
        System.out.println("do something");
    }
}
