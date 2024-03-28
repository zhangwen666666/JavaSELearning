package com.exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) {
        try {
            //创建输入流
            FileInputStream fis = new FileInputStream("D:\\curse\\02-JavaSE\\document\\JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
            //读文件
            fis.read(); //  这里也有异常，这个异常需要IOException对象来捕捉
        } catch(FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch(IOException e){
            System.out.println("读文件报错了！");
        }

        /*
        // 编译报错。
        try {
            //创建输入流
            FileInputStream fis = new FileInputStream("D:\\curse\\02-JavaSE\\document\\JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
            //读文件
            fis.read();
        } catch(IOException e){ //这里IOException已经包括了FileNotFoundException，所以下边的分支永远都执行不到
            System.out.println("读文件报错了！");
        } catch(FileNotFoundException e) {      // 已捕获到异常错误java.io.FileNotFoundException
            System.out.println("文件不存在！");
        }
        */
    }
}
