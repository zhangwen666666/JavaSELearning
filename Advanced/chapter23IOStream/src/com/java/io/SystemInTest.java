package com.java.io;

import java.io.BufferedInputStream;
import java.io.IOException;

public class SystemInTest {
    public static void main(String[] args) throws IOException {
        BufferedInputStream br = new BufferedInputStream(System.in);
        byte[] bytes = new byte[1024];
        int readCount = 0;
        while ((readCount = br.read(bytes)) != 0) {
            System.out.println(new String(bytes,0,readCount));
        }
    }
}
