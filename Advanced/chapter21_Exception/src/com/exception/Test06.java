package com.exception;

import java.io.FileNotFoundException;

public class Test06 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void m1() throws FileNotFoundException{
        m2();
    }

    private static void m2() throws FileNotFoundException {
        //创建了一个FileNotFoundException类型的异常对象e
        //如果该异常对象只是创建出来而没有抛出，是不会产生异常的。
        FileNotFoundException e = new FileNotFoundException("文件找不到，可能路径有问题");
        throw e;
    }
}
