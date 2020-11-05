package com.example.thread.other;


public class ThreadTest2 {

    public static void main(String args[]){
        TT t = new TT();

        //Thread thread = new Thread(t);
        //thread.setName("T thread");
        //thread.start();

        new Thread(t).start();

        while (true){
            //System.out.println("thread name=" + Thread.currentThread().getName());
            //System.out.println("obj=" + t);
            System.out.println(t.isFlag());
            if(t.isFlag()){
                System.out.println("-------------");
                break;
            }
        }

    }
}


class TT implements Runnable{
    private volatile boolean flag = false;

    @Override
    public void run() {
        try {
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag=" + flag);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}