package com.example.datatype;

public class StringTest {

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a +b;
        System.out.println(c == "ab");// false

        final String d = "d";
        final String e = "e";
        String f = d +e;
        System.out.println(f == "de");// true
        // javac StringTest.java
        // javap -v StringTest.class
    }
}
