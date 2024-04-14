package com.java.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("E:\\03.txt");
            char[] chars = new char[5];
            int readCount = 0;
            int readData = reader.read();
            System.out.println(readData);
            readData = reader.read();
            System.out.println(readData);
            readData = reader.read();
            System.out.println(readData);
            readData = reader.read();
            System.out.println(readData);

            //按照字符的方式读,第一次读'a'，第二次'b'，第三次'我'...
            while((readCount = reader.read(chars))!= -1){
                //ab我是一个中国人！！！
                System.out.print(new String(chars,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
