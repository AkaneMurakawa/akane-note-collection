package com.example.bean.demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * service provider interface
 */
public class SPITest {

    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = SPITest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("META-INF/class.properties");
        Properties properties = System.getProperties();
        properties.load(resourceAsStream);
        System.out.println(properties.getProperty("enableAutoConfiguration"));

    }
}
