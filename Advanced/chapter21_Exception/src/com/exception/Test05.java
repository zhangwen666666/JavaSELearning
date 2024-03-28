package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test05 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("F:\\JavaCode\\JavaSE");
            int i = 10 / 0;
        }catch( FileNotFoundException | ArithmeticException | NullPointerException e ){
            System.out.println("这里捕捉到异常时也无法区分具体是哪种异常了");
        }
    }
}
