package com.java.thread;

public class ThreadTest04 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread04());
        t.setName("线程0");
        t.start();

        try {
            Thread.sleep(1000 * 5);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //希望5秒之后中断线程0的睡眠
        t.interrupt();
    }
}

class MyThread04 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程启动");

        try {
            Thread.sleep(1000 * 60 * 60 * 24 * 365L);   //让线程休眠一年
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "线程结束");
    }
}
