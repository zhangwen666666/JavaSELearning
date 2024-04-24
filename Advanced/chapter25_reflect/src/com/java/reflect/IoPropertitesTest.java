package com.java.reflect;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class IoPropertitesTest {
    public static void main(String[] args) throws Exception{
        InputStream is = Thread.currentThread().getContextClassLoader().
                getResourceAsStream("classInfo.properties");
        Properties pro = new Properties();
        pro.load(is);  //读取属性配置文件
        is.close(); //关闭流
        String className = pro.getProperty("className");//获取类名
        Class c = Class.forName(className);//获取.class字节码文件
        Object o = c.newInstance();
        System.out.println(o);
    }
}
