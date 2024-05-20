package com.java.io;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamTest {
    public static void main(String[] args) {
        //往字节数组中写，这里new的时候不需要传字节数组
        //底层自动创建byte数组,并且会自动扩容
        ByteArrayOutputStream baos = new ByteArrayOutputStream();//字节流

        baos.write(1);
        baos.write(2);
        baos.write(3);

        //怎么获取内存中的byte字节数组呢？
        byte[] byteArray = baos.toByteArray();
        for (byte b : byteArray) {
            System.out.println(b);
        }
    }
}
