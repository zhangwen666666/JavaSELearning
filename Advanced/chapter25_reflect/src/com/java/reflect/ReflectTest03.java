package com.java.reflect;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class ReflectTest03 {
    public static void main(String[] args) throws Exception {
        String path = "chapter25_reflect/src/classInfo.properties";
        path = Thread.currentThread().getContextClassLoader().
                getResource("classInfo.properties").getPath();
        FileInputStream fis = new FileInputStream(path);

        InputStream is = Thread.currentThread().getContextClassLoader().
                getResourceAsStream("classInfo.properties");

        Properties pro = new Properties();
        pro.load(fis);  //读取属性配置文件
        fis.close(); //关闭流
        String className = pro.getProperty("className");//获取类名
        Class c = Class.forName(className);//获取.class字节码文件
        Object o = c.newInstance();
        System.out.println(o);
    }
}
