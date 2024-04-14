package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\01.txt");  //abcdef helloworld

            int readData = fis.read();
            System.out.println(readData);   //97  --a
            readData = fis.read();
            System.out.println(readData);   //98  --b
            readData = fis.read();
            System.out.println(readData);   //99  --c

            fis.skip(5);

            readData = fis.read();
            System.out.println(readData);   //101 --e

            /*int remainByte = fis.available();
            System.out.println("还剩下" + remainByte + "个字节可以读取");
            //直接创建一个指定大小的数组一次性读取
            byte[] bytes = new byte[remainByte];
            int readCount = fis.read(bytes);
            System.out.println("读取了" + readCount + "个字节");
            System.out.println(new String(bytes));*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
