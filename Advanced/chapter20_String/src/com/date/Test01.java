package com.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) throws Exception {
        Date nowTime = new Date();
        System.out.println(nowTime);    // Mon Mar 25 19:54:41 CST 2024
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String s1 = sdf.format(nowTime);
        System.out.println(s1); // 2024-03-25 20:29:18:612
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");
        String s2 = sdf1.format(nowTime);
        System.out.println(s2); // 2024/03/25 20:29:18:612
        SimpleDateFormat sdf2 = new SimpleDateFormat("yy年MM月dd日 HH时mm分ss秒SSS毫秒");
        String s3 = sdf2.format(nowTime);
        System.out.println(s3); // 24年03月25日 20时29分18秒612毫秒

        String time = "2000-12-22 23:08:14 333";
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dateTime = sdf4.parse(time);   // 这里需要给当前方法抛出一个异常
        System.out.println(dateTime);   // Fri Dec 22 23:08:14 CST 2000
    }
}
