package com.example;

import com.example.thread.other.PS;
import org.openjdk.jmh.annotations.*;

public class PSTest {
    // 所需测试的代码上标记
    @Benchmark
    // 预热，由于JVM中对于特定代码会存在优化（本地化），预热对于测试结果很重要
    // iterations: 迭代次数
    @Warmup(iterations = 1, time = 3)
    // 线程数
    @Fork(5)
    // 基准测试的模式，这里为QPS，ops/time
    @BenchmarkMode(Mode.Throughput)
    // 总共测试几次
    @Measurement(iterations = 1, time = 3)
    public void testForEach() {
        PS.foreach();
    }
}