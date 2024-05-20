package com.java.io.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public class GZIPInputStreamTest {
    public static void main(String[] args) throws Exception{
        //创建解压缩流
        GZIPInputStream gzip = new GZIPInputStream(new FileInputStream("E:\\dir\\test.txt.gz"));
        //创建文件字节输出流
        FileOutputStream fos = new FileOutputStream("E:\\dir\\test.txt");
        byte[] bytes = new byte[1024];
        int readCount = 0;
        while((readCount = gzip.read(bytes))!=-1){
            fos.write(bytes,0,readCount);
        }

        fos.close();
        gzip.close();
    }
}
