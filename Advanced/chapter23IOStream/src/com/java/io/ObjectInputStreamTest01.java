package com.java.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("E:\\object");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s1 = (Student)ois.readObject();
        System.out.println(s1);
        Student s2 = (Student)ois.readObject();
        System.out.println(s2);
        ois.close();
    }
}
