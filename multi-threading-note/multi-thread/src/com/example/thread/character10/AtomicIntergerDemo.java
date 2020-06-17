package com.example.thread.character10;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Atomic 示例
 */
public class AtomicIntergerDemo {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();

//        public final int getAndAdd(int delta) {
//            return unsafe.getAndAddInt(this, valueOffset, delta);
//        }
        atomicInteger.getAndAdd(12);
    }
}
