package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test08 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("F:\\01.txt");
            String s = null;
            s.toString();
            System.out.println("这里的代码不会执行");

            // 文件流使用完需要关闭 但是这里执行不到了
            // fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally { //由于无论是否发生异常，这里都会执行，因此需要再这里关闭文件流
            if(fis!=null){  //避免空指针异常
                try {   //fis.close()有异常，也需要处理
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
