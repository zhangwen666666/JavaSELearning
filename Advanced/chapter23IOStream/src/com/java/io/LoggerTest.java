package com.java.io;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerTest {
    public static void main(String[] args) throws Exception{
        Logger.log("创建了一个User对象");
        Logger.log("创建了一个Student对象");
    }
}

class Logger{
    public static void log(String msg) throws Exception{
        FileOutputStream fos = new FileOutputStream("E:\\log.txt",true);
        PrintStream ps = new PrintStream(fos);

        Date nowDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String time = sdf.format(nowDate);
        System.setOut(ps);
        System.out.println(time + " ------- " + msg);

        ps.flush();;
        ps.close();
    }
}
