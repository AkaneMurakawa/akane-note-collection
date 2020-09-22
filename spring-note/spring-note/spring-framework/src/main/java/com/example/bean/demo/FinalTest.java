package com.example.bean.demo;

import java.lang.reflect.Field;

public class FinalTest {

    static final String a2 = "a2";

    public static void main(String[] args) throws Exception {
        final String a = "a";
        Field value = String.class.getDeclaredField("value");
        value.setAccessible(true);
        value.set(a, new char[]{'b'});
        System.out.println(a);// b

        System.out.println(a2);// a2
        value.set(a2, new char[]{'b'});
        System.out.println(a2);// b
    }
}
