package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //创建文件字节流对象
            fis = new FileInputStream("E:\\01.txt");

            while(true){
                int readData = fis.read(); //返回值是读取到的字节本身
                if(readData == -1)
                    break;
                System.out.println(readData);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(fis!=null) { //防止空指针异常
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
