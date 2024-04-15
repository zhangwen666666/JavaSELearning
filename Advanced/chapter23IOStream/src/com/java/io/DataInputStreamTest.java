package com.java.io;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamTest {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("E:\\dataOutputStream");
        DataInputStream dis = new DataInputStream(fis);

        //读数据
        byte b = dis.readByte();
        System.out.println(b);  //100
        short s = dis.readShort();
        System.out.println(s);  //200
        int i = dis.readInt();
        System.out.println(i);  //300
        long l = dis.readLong();
        System.out.println(l);  //400
        float f = dis.readFloat();
        System.out.println(f);  //3.14
        double d = dis.readDouble();
        System.out.println(d);  //2.71828
        boolean b1 = dis.readBoolean();
        System.out.println(b1); //true
        char c = dis.readChar();
        System.out.println(c);  //'c'
        String s1 = dis.readUTF();
        System.out.println(s1); //"张三"

        dis.close();;
    }
}
