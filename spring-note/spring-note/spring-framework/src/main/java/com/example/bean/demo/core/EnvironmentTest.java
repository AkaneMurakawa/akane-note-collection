package com.example.bean.demo.core;

import java.util.Enumeration;
import java.util.Properties;

public class EnvironmentTest {

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        Enumeration<?> enumeration = properties.propertyNames();
        while(enumeration.hasMoreElements()){
            Object name = enumeration.nextElement();
            System.out.println(String.format("n%s: %s",name.toString(), properties.get(name)));
        }


    }
}
