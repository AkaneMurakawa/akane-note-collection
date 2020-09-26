package com.example.bean.config;

import com.example.bean.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.*")
public class BeanConfiguration {

    @Bean(value = "defaultUser", initMethod = "init", destroyMethod = "destroy")
    public User getUser(){
        return User.createDefaultUser();
    }
}
