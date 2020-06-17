package com.example.thread.character2;

/**
 * Thread一些方法 示例
 */
public class ThreadMethodDemo {

    public static void main(String[] args) throws InterruptedException{
        // 返回对当前正在执行的线程对象的引用；native方法
        Thread currentThread =
                Thread.currentThread();

                // 启动 synchronized
                currentThread.start();
                // 运行
                currentThread.run();
                // 放弃
                currentThread.yield();
                // 睡眠
                Thread.sleep(1);
                // 等待加入
                // 当前线程等待另一个线程执行完毕之后再继续执行
                currentThread.join();

                // 设置优先级
                currentThread.setPriority(2);
                // 设置未守护线程
                currentThread.setDaemon(true);

    }
}
