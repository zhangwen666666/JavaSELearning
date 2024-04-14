package com.java.io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("E:\\01.txt",true);
            String s = "helloworld!!";
            char[] chars = s.toCharArray();
            writer.write(chars);
            String s1 = "我是中国人！！";
            writer.write(s1);

            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
