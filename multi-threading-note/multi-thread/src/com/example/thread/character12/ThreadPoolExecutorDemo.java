package com.example.thread.character12;

import java.util.concurrent.*;

/**
 * ThreadPoolExecutor 示例
 */
public class ThreadPoolExecutorDemo {

    private final Executor cachedThreadPool = Executors.newCachedThreadPool();
    private final Executor fixedThreadPool = Executors.newFixedThreadPool(5);
    private final Executor singleThreadExecutor = Executors.newSingleThreadExecutor();
    private final Executor scheduledExecutor = Executors.newScheduledThreadPool(10);

    private final Executor pool = new ThreadPoolExecutor(
            5,
            10,
            10L,
            TimeUnit.MINUTES,
            new LinkedBlockingDeque<>(50),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy()
            );

    // 默认拒绝处理策略，丢弃任务并抛出RejectedExecutionException异常
    RejectedExecutionHandler abortPolicy = new ThreadPoolExecutor.AbortPolicy();
    // 由调用线程处理该任务
    RejectedExecutionHandler callerRunsPolicy = new ThreadPoolExecutor.CallerRunsPolicy();
    // 丢弃队列头部（最旧的）的任务，然后重新尝试执行程序（如果再次失败，重复此过程）
    RejectedExecutionHandler discardOldestPolicy = new ThreadPoolExecutor.DiscardOldestPolicy();
    // 丢弃新来的任务，但是不抛出异常
    RejectedExecutionHandler discardPolicy = new ThreadPoolExecutor.DiscardPolicy();

    public static void main(String[] args) {
    }
}
