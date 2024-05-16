package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class PrintStream {
    public static void main(String[] args) throws Exception {
        //保存最开始的从控制台获取输入的标准输入流
        InputStream oldIn = System.in;

        //修改标准输入流的方向
        System.setIn(new FileInputStream("E:\\dir\\文件1.txt"));

        //获取修改后的标准输入流
        InputStream in = System.in;

        //读数据
        byte[] bytes = new byte[1024];
        int readCount = 0;
        while ((readCount = in.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, readCount));
        }

        // 将标准输入流的方向修改回去
        System.setIn(oldIn);
    }
}
