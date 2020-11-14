package com.example;

// 双重检查(同步代码块)
class Singleton4{

    // 1.私有化构造方法
    private Singleton4(){}

    // volatile保证内存可见性，防止指令重排
    private static volatile Singleton4 instance;

    // 2.获取
    public static Singleton4 getInstance(){
        if (instance == null) {
            synchronized (Singleton4.class){
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

}