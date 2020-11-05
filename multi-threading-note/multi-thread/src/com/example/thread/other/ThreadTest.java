package com.example.thread.other;

public class ThreadTest {

    public static void main(String args[]){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        new Thread(() -> t1.setFlag(1)).start();
        new Thread(() -> t2.setFlag(2)).start();
        while (true){
            if (2 == t2.getFlag()){
                System.out.println("t2-------------");
                break;
            }
            if (1 == t1.getFlag()){
                System.out.println("t1-------------");
                break;
            }
            // synchronized会清空工作内容
            //synchronized (t2){
            //}
        }

    }
}


class MyThread{

    private int flag = 0;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.flag = flag;
    }
}