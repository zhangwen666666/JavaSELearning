package com.java.io;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("a\\b\\c\\d");
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        file.mkdirs();
        System.out.println(file.exists());
        file.delete();
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
}
