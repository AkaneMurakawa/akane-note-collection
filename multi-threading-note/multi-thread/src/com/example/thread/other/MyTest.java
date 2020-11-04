package com.example.thread.other;

import java.util.ArrayList;
import java.util.List;

public class MyTest {

    public static void main(String[] args) {

        List<User> list = new ArrayList<>();

        list.add(new User("name", "http://xxx.com"));
        list.add(new User("name", "https://xxx.com"));

        System.out.println(list.get(0).name == list.get(1).name); // true
        String a = "a";
        String b = "a";
        //String c = "a".intern();
        //String c = a;
        //String c = a.intern();
        //String c = new String("a"); // false
        String c = new String("a").intern();

        System.out.println(b == a);
        System.out.println(c == a);

        String ab = "ab";
        final String aa = "a";
        final String bb = "b";
        final String abb = aa + bb;
        System.out.println(ab == abb);

        // mybatis查询，new string()
    }
}
