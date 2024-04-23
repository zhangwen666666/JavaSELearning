package com.java.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest09 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        Thread producerThread = new Thread(new Producer(list),"生产者");
        Thread consumerThread = new Thread(new Consumer(list),"消费者");
        producerThread.start();
        consumerThread.start();
    }
}


//生产者线程
class Producer implements Runnable {
    private List<Object> list;

    public Producer(List<Object> list) {
        this.list = list;
    }

    public void run() {
        while (true) {
            synchronized (list) {
                if (list.size() > 2) { //如果仓库满了，则阻塞
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object o = new Object(); //生产
                list.add(o); //放入仓库
                System.out.println(Thread.currentThread().getName() + "成功生产：" + o
                        + "\t" + list.size());
                try {
                    Thread.sleep(1000); //模拟延迟
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.notify(); //唤醒消费者线程
            }
        }
    }
}


//消费者线程
class Consumer implements Runnable {
    private List<Object> list;

    public Consumer(List<Object> list) {
        this.list = list;
    }

    public void run() {
        while (true) {
            synchronized (list) {
                if (list.size() == 0) { //如果仓库空了，则阻塞
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object o = list.remove(0); //消费者消费
                System.out.println(Thread.currentThread().getName() + "成功消费：" + o
                        + "\t" + list.size());
                try {
                    Thread.sleep(1000); //模拟延迟
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.notify(); //唤醒生产者线程
            }
        }
    }
}
