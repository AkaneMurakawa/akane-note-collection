package com.example.bean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BService {

    @Autowired
    AService aService;

    public BService(){
        System.out.println("B service constructor");
    }

}
