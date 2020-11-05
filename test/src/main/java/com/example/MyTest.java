package com.example;

import java.util.ArrayList;
import java.util.List;

public class MyTest {

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();

        list.add(new User("name", "http://xxx.com"));
        list.add(new User("name", "https://xxx.com"));

        System.out.println(list.get(0).name == list.get(1).name); // true
        String a = "a";
        String b = "a"; // true
        String c = "a".intern(); // true
        String d = a; // true
        String e = a.intern(); // true
        String f = new String("a"); // false
        String g = new String("a").intern(); // true

        System.out.println(b == a);// true
        System.out.println(c == a);// true
        System.out.println(d == a);// true
        System.out.println(e == a);// true
        System.out.println(f == a);// false
        System.out.println(g == a);// true

        String ab1 = "ab";
        String aa1 = "a";
        String bb1 = "b";
        String aabb1 = aa1 + bb1;
        System.out.println(ab1 == aabb1); // false


        String ab2 = "ab";
        final String aa2 = "a";
        final String bb2 = "b";
        final String aabb2 = aa2 + bb2;
        System.out.println(ab2 == aabb2); // true

        // mybatis查询，new string()

    }
}
