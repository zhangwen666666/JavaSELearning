package com.map;

import java.util.Properties;

public class PropertiesTest01 {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("name","张三");
        p.setProperty("id","123456");
        p.setProperty("age","18");
        p.setProperty("sex","男");
        p.setProperty("tel","13934675649");

        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("id"));
        System.out.println(p.getProperty("age"));
        System.out.println(p.getProperty("sex"));
        System.out.println(p.getProperty("tel"));
    }
}

