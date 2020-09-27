package com.example.bean.demo.lifecycle;

import com.example.bean.config.BeanConfiguration;
import com.example.bean.service.UserAService;
import com.example.bean.service.UserBService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "com.example.bean.service")
public class CircularReference {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(BeanConfiguration.class);
        applicationContext.refresh();

        UserAService userA = (UserAService)applicationContext.getBean("userA");
        UserBService userB = (UserBService)applicationContext.getBean("userB");

        System.out.println(userA);
        System.out.println(userB);
    }

}