package com.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;

public class GZipOutputStreamTest {
    public static void main(String[] args) throws Exception{
        //创建输入流对象
        FileInputStream fis = new FileInputStream("E:\\dir\\文件1.txt");
        //创建压缩流对象
        GZIPOutputStream gzip = new GZIPOutputStream(new FileOutputStream("E:\\dir\\test.txt.gz"));
        //一边读一边写
        byte[] bytes = new byte[1024];
        int readCount = 0;
        while((readCount = fis.read(bytes))!=-1){
            gzip.write(bytes,0,readCount);
        }

        gzip.finish();

        //关闭流
        fis.close();
        gzip.close();
    }
}
