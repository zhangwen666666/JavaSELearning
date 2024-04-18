package com.java.thread;

public class ThreadTest01 {
    public static void main(String[] args) {
        //创建一个分支线程对象
        MyThread myThread = new MyThread();
        //启动分支线程
        myThread.start();

        //下面的代码还是运行在主线程中
        for (int i = 0; i < 3; i++) {
            System.out.println("主线程中的i----->" + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("分支线程中的i=====" + i);
        }
    }
}