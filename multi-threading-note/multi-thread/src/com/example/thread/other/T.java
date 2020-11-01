package com.example.thread.other;

import java.util.ArrayList;
import java.util.List;

/**
 * volatile不支持原子性
 */
public class T {

    volatile int count = 0;
    void sum(){
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public static void main(String[] args) {

        T t = new T();
        List<Thread> threads = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(t::sum, "thread-" + i));
        }
        threads.forEach(o -> o.start());

        threads.forEach(o -> {
            try {
                o.join();
            }catch (InterruptedException e){}
        });

        System.out.println("sum:" + t.count); // != 100000
    }
}
