package com.example.finaltest;

import java.util.ArrayList;
import java.util.List;

public class FinalDemo {

    private final List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        FinalDemo demo = new FinalDemo();
        // 被fianl修饰，无法修改其内存地址，但可以修改其值
        demo.list.add("1");
        demo.list.forEach(System.out::println);

        // 尝试修改其内存地址，IDEA直接报错了
        // Cannot assign a value to final variable 'list'
//        demo.list = new ArrayList<>();
    }
}
