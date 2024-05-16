package com.java.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderMarkTest01 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("E://userInfo.properties"))){
            br.mark(1);
            System.out.println(br.readLine());//name=zhangsan
            System.out.println(br.readLine());//age=20
            System.out.println(br.readLine());//sex=?
            br.reset();
            System.out.println(br.readLine());//name=zhangsan
            System.out.println(br.readLine());//age=20
            System.out.println(br.readLine());;//sex=?
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
