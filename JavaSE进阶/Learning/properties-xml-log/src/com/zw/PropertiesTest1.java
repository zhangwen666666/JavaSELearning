package com.zw;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest1 {
    public static void main(String[] args) throws IOException {
        // 1.创建一个Properties的对象出来(键值对集合，空容器)
        Properties properties = new Properties();

        // 2.加载属性文件中的键值对数据到properties对象中去
        String path = "properties-xml-log/src/users.properties";
        properties.load(new FileReader(path));
        System.out.println(properties);

        // 3. 根据键获取对应的值
        System.out.println(properties.getProperty("admin"));
        System.out.println(properties.getProperty("张无忌"));

        // 4. 遍历全部的键和值
        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            String value = properties.getProperty(key);
            System.out.println(key + "---->" + value);
        }
        // 使用lambda表达式
        properties.forEach((k, v) -> {
            System.out.println(k + "---->" + v);
        });
    }
}
