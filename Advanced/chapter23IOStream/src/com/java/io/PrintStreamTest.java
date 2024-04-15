package com.java.io;

import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream("E:\\printStream.txt");

        //保存原始的System.out
        PrintStream originalOut = System.out;

        //修改标准输出流的输出方向
        System.setOut(ps);
        System.out.println(123);
        System.out.println("zhangsan");
        System.out.println(3.14);

        ps.flush();
        ps.close();

        //将标准输出流的输出方向改回控制台
        System.setOut(originalOut);
        System.out.println(1);
    }
}
