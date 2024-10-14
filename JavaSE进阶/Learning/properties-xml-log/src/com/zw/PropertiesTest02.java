package com.zw;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest02 {
    public static void main(String[] args) throws IOException {
        // 1.创建Properties对象，存储键值对数据
        Properties properties = new Properties();
        properties.setProperty("张伟","0001");
        properties.setProperty("张翠三","cuicui");

        // 2. 把properties对象中的键值对数据存入到属性文件中去
        String path = "properties-xml-log/src/users2.properties";
        properties.store(new FileWriter(path), "这里保存注释,可以随便写");
    }
}
