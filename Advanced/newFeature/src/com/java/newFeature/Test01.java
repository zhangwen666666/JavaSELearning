package com.java.newFeature;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("E:\\dir\\文件6.mp3");
        FileOutputStream fos = new FileOutputStream("E:\\音频.mp3");
        try(fis;fos){
            byte[] bytes = new byte[1024];
            int readCount = 0;
            while((readCount= fis.read(bytes))!=-1){
                fos.write(bytes,0,readCount);
                fos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
