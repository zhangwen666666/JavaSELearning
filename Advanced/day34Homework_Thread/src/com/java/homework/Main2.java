package com.java.homework;



public class Main2 {
    public static void main(String[] args) {
        Number number = new Number(1);
        Thread t1 = new Thread(new PrintOdd(number),"t1");
        Thread t2 = new Thread(new PrintEven(number),"t2");
        t1.start();
        t2.start();
    }
}

class Number {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class PrintOdd implements Runnable {
    private Number number;

    public PrintOdd(Number number) {
        this.number = number;
    }

    public void run() {
        while (true) {
            synchronized (number) {
                if (number.getValue() % 2 == 0) {
                    try {
                        number.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                int value = number.getValue();
                System.out.println(Thread.currentThread().getName() + " ---> i = " + value);
                number.setValue(++value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                number.notify();
            }
        }
    }
}

class PrintEven implements Runnable {
    private Number number;

    public PrintEven(Number number) {
        this.number = number;
    }

    public void run(){
        while (true) {
            synchronized (number) {
                if (number.getValue() % 2 == 1) {
                    try {
                        number.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                int value = number.getValue();
                System.out.println(Thread.currentThread().getName() + " ---> i = " + value);
                number.setValue(++value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                number.notify();
            }
        }
    }
}