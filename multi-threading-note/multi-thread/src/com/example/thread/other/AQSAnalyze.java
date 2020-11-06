package com.example.thread.other;

import java.util.concurrent.locks.ReentrantLock;

public class AQSAnalyze {


    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);
        lock.lock();
        lock.unlock();
    }
}
