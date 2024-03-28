package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test07 {
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        int i = 10;
        try{
            //由于m2()方法抛出了异常，且该异常属于编译时异常，所以这里必须处理该异常
            m2();   //实际调用m2()时并没有发生异常，因此下边的代码会执行
            System.out.println("。。。");
        } catch (FileNotFoundException e) { //由于没有捕捉到异常，这个分支不会执行
            e.printStackTrace();
        }
    }

    public static void m2() throws FileNotFoundException {
        System.out.println("这个方法只是抛出了异常，但没有异常对象，没有真正发生异常");
    }
}
