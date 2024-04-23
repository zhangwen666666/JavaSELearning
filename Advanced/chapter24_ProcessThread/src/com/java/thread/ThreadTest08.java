package com.java.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest08 {
    public static void main(String[] args) {
        Callable<Integer> c = new Task();
        FutureTask<Integer> task = new FutureTask<Integer>(c);
        Thread t = new Thread(task);
        t.start();
        try {
            Object o = task.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main方法结束");
    }
}

class Task implements Callable<Integer> {
    public Integer call() throws Exception {
        System.out.println("call begin");
        Thread.sleep(1000 * 10);
        System.out.println("call over");
        int a = 100;
        int b = 200;
        return a + b;
    }
}
