package com.java.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args){
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        try {
            reader = new FileReader("E:02.txt");
            bufferedReader = new BufferedReader(reader);
            String s = null;
            while((s = bufferedReader.readLine())!=null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
