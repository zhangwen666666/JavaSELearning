package com.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest11 {
    public static void main(String[] args) {
        //创建线程池对象
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        //将任务提交给线程池(不需要接触这个线程对象，只需要将要处理的任务提交给线程池即可)
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i <= 10;i++){
                    System.out.println(Thread.currentThread().getName() + "--->" + i);
                }
            }
        });

        //最后一定要关闭线程池
        executorService.shutdown();
    }
}
