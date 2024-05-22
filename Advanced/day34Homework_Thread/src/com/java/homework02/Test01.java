package com.java.homework02;

//实现两个线程交替输出
public class Test01 {
    public static void main(String[] args) {
        PrintThread pt = new PrintThread();
        Thread t1 = new Thread(pt);
        Thread t2 = new Thread(pt);
        Thread t3 = new Thread(pt);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class PrintThread implements Runnable {

    private int number = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (Thread.currentThread().getName().equals("t1") && number % 3 == 1){
                    System.out.println("t1---->" + number++);
                }
                if (Thread.currentThread().getName().equals("t2") && number % 3 == 2){
                    System.out.println("t2---->" + number++);
                }
                if (Thread.currentThread().getName().equals("t3") && number % 3 == 0){
                    System.out.println("t3---->" + number++);
                }
            }
        }
    }
}
