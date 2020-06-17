package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 简单测试
 */
public class Test {

    static class User{
        public String a;
        public String b;

        public User(String a, String b) {
            this.a = a;
            this.b = b;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World");

        List<User> tests = new ArrayList<User>(){{
            add(new User("aa", "bb"));
            add(new User("bb", "cc"));
        }};
    }
}
