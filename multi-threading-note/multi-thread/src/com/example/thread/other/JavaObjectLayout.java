package com.example.thread.other;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;

public class JavaObjectLayout {

    public static void main(String[] args) throws InterruptedException{
        final A a = new A();
        ClassLayout layout = ClassLayout.parseInstance(a);
        System.out.println("****Fresh object");
        System.out.println(layout.toPrintable());// 01, 无锁可偏向

        Thread t = new Thread(() -> {
            synchronized (a){
                try {
                    TimeUnit.SECONDS.sleep(10);
                }catch (InterruptedException e){
                    return;
                }
            }
        });
        t.start();


        TimeUnit.SECONDS.sleep(1);

        System.out.println("****Before the lock");
        System.out.println(layout.toPrintable());// 00, 轻量级锁


        synchronized (a){
            System.out.println("****With the lock");
            System.out.println(layout.toPrintable());// 10, 重量级锁
        }


        System.out.println("****After the lock");
        System.out.println(layout.toPrintable());// 10, 锁不会降级

        System.gc();

        System.out.println("****After System.gc()");
        System.out.println(layout.toPrintable());// 如果非11，可能未gc

    }
}


class A{

}