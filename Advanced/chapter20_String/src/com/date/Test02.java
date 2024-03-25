package com.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) {
        long nowTimeMillis = System.currentTimeMillis();
        System.out.println(nowTimeMillis);  //1711371305056

        Date time = new Date(System.currentTimeMillis());
        System.out.println(time);   //Mon Mar 25 21:16:17 CST 2024
        long m = 1000 * 60 * 60 * 24 * 366L;
        Date time2 = new Date(System.currentTimeMillis() - m);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss SSS");
        System.out.println(sdf.format(time2));  //2024-03-24 21-23-01 700
    }
}
