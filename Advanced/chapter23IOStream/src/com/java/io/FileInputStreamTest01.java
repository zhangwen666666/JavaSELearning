package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        //创建文件字节流对象
        //E:\01.py
        try {
            fis = new FileInputStream("E:\\01.py");

            int readData = fis.read(); //该方法的返回值是读取到的字节本身
            System.out.println(readData);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }finally {    //在finally语句块中关闭文件流
            if (fis != null) { //避免空指针异常
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
