package com.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;

public class FileTest02 {
    public static void main(String[] args) throws Exception {
        File file = new File("E:\\02");

        //创建过滤器 过滤器需要实现接口FilenameFilter 这里采用匿名内部类
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                // 返回 true 表示接受该文件/目录，false 表示排除该文件/目录
                return !name.startsWith("文件");
            }
        };

        //获取满足过滤条件的文件和目录
        File[] files = file.listFiles(filter);
        if (files != null) {
            for (File f : files) {
                System.out.println(f.getName());
            }
        }

        FileReader reader = new FileReader("E:\\02.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String s = null;
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
        }
        bufferedReader.close();
    }
}