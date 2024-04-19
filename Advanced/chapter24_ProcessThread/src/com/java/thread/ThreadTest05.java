package com.java.thread;

public class ThreadTest05 {
    public static void main(String[] args) {
        MyThread05 m = new MyThread05();
        Thread t = new Thread(m);
        t.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        m.run = false;
    }
}

class MyThread05 implements Runnable {
    public boolean run = true;

    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("i = " + i);
            }else{
                //这里在结束线程之前可以保存数据
                return;
            }
        }
    }
}
