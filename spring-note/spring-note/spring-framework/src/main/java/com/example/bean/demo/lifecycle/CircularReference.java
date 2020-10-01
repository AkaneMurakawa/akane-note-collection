package com.example.bean.demo.lifecycle;

import com.example.bean.config.CircularReferenceConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CircularReference {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(CircularReferenceConfiguration.class);
        applicationContext.refresh();

    }
}