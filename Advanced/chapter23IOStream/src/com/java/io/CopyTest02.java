package com.java.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTest02 {
    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("E:\\02.txt");
            writer = new FileWriter("F:\\copy02.txt");

            char[] chars = new char[3];
            int readCount = 0;
            while ((readCount = reader.read(chars)) != -1){
                writer.write(chars,0,readCount);
            }

            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

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
