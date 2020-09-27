package com.example.bean.demo.core;

import com.example.bean.domain.SimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/META-INF/spring-core.xml");
        SimpleBean simpleBean = (SimpleBean) applicationContext.getBean("simpleBean");
        simpleBean.send();

//        System.setProperty("path", "classpath");
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("${path}:/META-INF/spring-core.xml");
    }


}
