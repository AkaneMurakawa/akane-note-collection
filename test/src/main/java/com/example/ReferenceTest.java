package com.example;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenceTest {

    public static void main(String[] args) {
        // String a = "a";
        String a = new String("a");//强引用
        WeakReference<String> weakReference = new WeakReference<>(a);
        System.out.println(weakReference.get()); // a
        a = null; // 去掉强引用
        System.gc();
        System.out.println(weakReference.get()); // null

        String b = new String("b");//强引用
        SoftReference<String> stringSoftReference = new SoftReference<>(b);
        System.out.println(stringSoftReference.get()); // b
        b = null; // 去掉强引用
        System.gc();
        System.out.println(stringSoftReference.get()); // b
    }
}
