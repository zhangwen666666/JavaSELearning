package com.java.thread;

public class ThreadTest03 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread03());
        System.out.println(t1.getName());   //Thread-0
        t1.setName("线程0");
        System.out.println(t1.getName());   //线程0
        t1.start();

        Thread t2 = new Thread(new MyThread03());
        System.out.println(t2.getName());   //Thread-1
        t2.start();

        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());    //main
        currentThread.setName("主线程");
        System.out.println(currentThread.getName());    //主线程

        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000 * 3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(currentThread.getName() + "===>" + i);
        }
    }
}

class MyThread03 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000 * 3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
    }
}
