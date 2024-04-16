package com.java.io;

import java.io.*;

public class CopyTest03 {
    public static void main(String[] args) throws Exception{
        File file = new File("E:\\桌面\\作业");
        File destFile = new File("F:\\24-4-16");
        copyFile(file, destFile);
    }

    public static void copyFile(File srcFile, File destFile) throws Exception {
        if(srcFile == null) return;
        String fileName = srcFile.getName();    //获取文件名
        String destPath = destFile.getAbsolutePath();   //获取目的地父路径
        String path = destPath + "\\" + fileName;   //拼接文件名与路径得到目的地路径
        if (srcFile.isFile()) { //是文件直接复制
            FileInputStream fis = new FileInputStream(srcFile);     //创建文件输入字节流
            FileOutputStream fos = new FileOutputStream(path);      //创建文件输出字节流
            byte[] bytes = new byte[1024];
            int readNum = 0;
            while ((readNum = fis.read(bytes)) != -1) { //边读边写
                fos.write(bytes, 0, readNum);
            }
            fos.flush();
        }
        else if(srcFile.isDirectory()){ //如果是文件夹
            File[] files = srcFile.listFiles(); //获取子文件和子目录
            File dir = new File(path);
            dir.mkdirs();   //创建文件夹
            if(files != null){
                for(File file: files){
                    copyFile(file,dir);
                }
            }
        }
    }
}
