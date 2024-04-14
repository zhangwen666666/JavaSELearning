package com.java.io;

import java.io.*;

public class BufferedReaderTest02 {
    public static void main(String[] args) throws Exception{
        //字节流
        FileInputStream fis = new FileInputStream("E:\\02.txt");

        //将字节流转换为字符流  fis是节点流，isr是包装流
        InputStreamReader isr = new InputStreamReader(fis);

        //这里isr是节点流，br是包装流。
        //可以合并起来写
        //BufferedReader br = new BufferedReader(
        //        new InputStreamReader(new FileInputStream("E:\\02.txt")));
        BufferedReader br = new BufferedReader(isr);
        String s = null;
        while((s = br.readLine())!=null){
            System.out.println(s);
        }

        br.close();

        FileWriter fw = new FileWriter("E:\\02.txt");
//        FileOutputStream fos = new FileOutputStream(fw);
        BufferedOutputStream bos = new BufferedOutputStream(fw);
    }
}
