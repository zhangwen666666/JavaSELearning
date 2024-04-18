package com.java.io;

import java.io.FileInputStream;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class IoPropertiesTest {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("E:\\userInfo.properties");
        Properties userInfo = new Properties();
        userInfo.load(fis);

        Set<Map.Entry<Object, Object>> entrySet = userInfo.entrySet();
        for (Map.Entry<Object, Object> elem : entrySet) {
            String key = (String) elem.getKey();
            String value = (String) elem.getValue();
            System.out.println(key + "=" + value);
        }

        fis.close();
    }
}
