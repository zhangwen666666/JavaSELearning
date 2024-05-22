package com.java.threadsafe;

import java.util.concurrent.locks.ReentrantLock;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    private static final ReentrantLock lock = new ReentrantLock();

    public static Singleton getSingleton() {
        try {
            if (singleton == null) {
                lock.lock(); //加锁
                if (singleton == null) {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    singleton = new Singleton();
                }
            }
        } finally {
            lock.unlock();//解锁
        }
        return singleton;
    }
}

class SingletonTest {
    static Singleton s1 = null;
    static Singleton s2 = null;

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                s1 = Singleton.getSingleton();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                s2 = Singleton.getSingleton();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}
