package com.java.homework;

//用两个线程轮流打印数字

public class Main {
    public static void main(String[] args) {
        Flag flag = new Flag(false,1);
        Thread t1 = new Thread(new PrintThread(flag),"t1");
        Thread t2 = new Thread(new PrintThread2(flag),"t2");
        t1.start();
        t2.start();
    }
}

class PrintThread implements Runnable {
    private Flag flag;

    public PrintThread(Flag flag) {
        this.flag = flag;
    }

    public void run() {
        while (true) {
            synchronized (flag) {
                if (flag.getFlag()) {
                    try {
                        flag.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                int i = flag.getI();
                System.out.println(Thread.currentThread().getName() + "---> i = " + i);
                flag.setI(++i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                flag.setFlag(true);
                flag.notify();
            }
        }
    }
}


class PrintThread2 implements Runnable {
    private Flag flag;

    public PrintThread2(Flag flag) {
        this.flag = flag;
    }

    public void run() {
        while (true) {
            synchronized (flag) {
                if (!flag.getFlag()) {
                    try {
                        flag.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                int i = flag.getI();
                System.out.println(Thread.currentThread().getName() + "---> i = " + i);
                i++;
                flag.setI(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                flag.setFlag(false);
                flag.notify();
            }
        }
    }
}

class Flag{
    private boolean flag;
    private int i;

    public Flag(boolean flag, int i) {
        this.flag = flag;
        this.i = i;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}