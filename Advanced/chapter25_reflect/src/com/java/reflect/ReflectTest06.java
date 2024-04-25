package com.java.reflect;

import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.ResourceBundle;

public class ReflectTest06 {
    public static void main(String[] args) throws Exception {
        //读取属性配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("classInfo");
        //获取类型
        Class className = Class.forName(bundle.getString("className"));
        Object obj = className.newInstance();   //创建对象
        //获取所有的key 返回值类似于Iterator对象
        Enumeration<String> keys = bundle.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            if ("className".equals(key))
                continue;
            Field field = className.getDeclaredField(key);    //拿到对象的属性
            field.setAccessible(true);  //打破封装 否则只能访问公开的属性
            //拿到配置文件中该属性的值 拿到的是字符串 需要做类型转换
            String valueTemp = bundle.getString(key);
            if (field.getType() == int.class) {
                int value = Integer.parseInt(valueTemp);
                field.set(obj, value);   //给对象obj的field属性赋值value
            } else if (field.getType() == boolean.class) {
                boolean value = Boolean.parseBoolean(valueTemp);
                field.set(obj, value);   //给对象obj的field属性赋值value
            } else if (field.getType() == String.class) {
                field.set(obj, valueTemp);
            }
        }
        System.out.println(obj);//Student{name='zhangsan', age=20, sex=true, no=11111}
    }
}
