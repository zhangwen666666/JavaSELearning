package com.java.thread;

public class ThreadTest02 {
    public static void main(String[] args) {
        // 创建一个可运行的对象
        MyThread02 myThread02 = new MyThread02();
        // 将可运行的对象封装成一个线程
        Thread thread = new Thread(myThread02);
        // 启动线程
        thread.start();
        for(int i = 0 ;i<100;i++){
            System.out.println("主线程 i=====>" + i);
        }
    }
}

// 不是一个线程，只是一个可运行的类
class MyThread02 implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ;i<100;i++){
            System.out.println("分支线程 i----->" + i);
        }
    }
}
