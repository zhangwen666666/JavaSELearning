package com.java.io;

import java.io.*;
import java.util.Date;

public class ByteArrayOutputStreamTest02 {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        //写数据
        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeDouble(3.14);
        oos.writeUTF("abc");
        oos.writeObject(new Date());
        //刷新
        oos.flush();//包装流需要刷新
        //读取内存中的byte数组
        byte[] byteArray = baos.toByteArray();
        //使用ByteArrayInputStream将读取到的数组恢复
        //需要指定读取的数组
        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
        ObjectInputStream ois = new ObjectInputStream(bais);
        System.out.println(ois.readInt());//100
        System.out.println(ois.readBoolean());//true
        System.out.println(ois.readDouble());//3.14
        System.out.println(ois.readUTF());//abc
        System.out.println(ois.readObject());//Mon May 20 16:38:22 CST 2024
    }
}
