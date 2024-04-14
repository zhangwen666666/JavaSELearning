package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\01.txt");
            byte[] b = new byte[4];
            int readCount = 0;
            while ((readCount = fis.read(b)) != -1) {
                //将读取到的字节数组转换为字符串，读取几个字节就应该转换几个字节
                String s = new String(b,0,readCount);
                System.out.print(s);
            }
            System.out.println();
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
