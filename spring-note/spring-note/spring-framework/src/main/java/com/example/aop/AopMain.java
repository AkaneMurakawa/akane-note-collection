package com.example.aop;

import com.example.aop.service.CService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.example.aop.*")
@EnableAspectJAutoProxy
public class AopMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopMain.class);

        CService bean = context.getBean(CService.class);
        bean.dosomething();

    }
}
