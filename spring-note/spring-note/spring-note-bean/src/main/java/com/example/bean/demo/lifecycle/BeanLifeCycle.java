package com.example.bean.demo.lifecycle;

import com.example.bean.config.BeanConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Bean的生命周期
 */
public class BeanLifeCycle {



    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(BeanConfiguration.class);

        applicationContext.refresh();

        applicationContext.removeBeanDefinition("defaultUser");

    }

}
