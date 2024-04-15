package com.java.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamTest {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("E:\\dataOutputStream");
        DataOutputStream dos = new DataOutputStream(fos);

        byte b = 100;
        short s = 200;
        int i = 300;
        long l = 400L;
        float f = 3.14f;
        double d = 2.71828;
        boolean b1 = true;
        char c = 'a';
        String str = "张三";

        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(b1);
        dos.writeChar(c);
        dos.writeUTF(str);

        dos.flush();
        dos.close();
    }
}
