package com.java.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ThreadTest07 {
    public static void main(String[] args) {
        Timer timer = new Timer(true);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = null;
        try {
            firstTime = sdf.parse("2024-4-22 19:15:30");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        timer.schedule(new logTimerTask(), firstTime, 1000 * 5);
        try {
            Thread.sleep(1000 * 30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class logTimerTask extends TimerTask {
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(new Date());
        System.out.println(Thread.currentThread().getName() + "  " + time + "完成了一次数据备份！");
    }
}
