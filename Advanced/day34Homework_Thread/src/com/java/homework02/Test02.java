package com.java.homework02;

//三个线程交替输出ABC
//使用线程同步机制

public class Test02 {
    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class MyRunnable implements Runnable {

    private boolean t1Output = true;
    private boolean t2Output = false;
    private boolean t3Output = false;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(t1Output) {
                    System.out.println("t1--->A");
                    t1Output = false;
                    t2Output = true;
                }
                else if (t2Output){
                    System.out.println("t2--->B");
                    t2Output = false;
                    t3Output = true;
                }else {
                    System.out.println("t3--->C");
                    t3Output = false;
                    t1Output = true;
                }
            }
        }
    }
}
