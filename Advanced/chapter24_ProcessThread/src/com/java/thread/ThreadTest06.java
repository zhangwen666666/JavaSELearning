package com.java.thread;

public class ThreadTest06 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread06());
        t1.setName("守护线程");
        t1.setDaemon(true);
        t1.start();
        System.out.println("main---begin");
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MyThread06 m = new MyThread06();
        Thread t2 = new Thread(m);
        t2.setName("t线程");
        t2.start();
        try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m.setFlag(false);
        System.out.println("main---over");

    }
}


class MyThread06 implements Runnable {
    boolean flag = true;
    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println(Thread.currentThread().getName() + "---->  i = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}