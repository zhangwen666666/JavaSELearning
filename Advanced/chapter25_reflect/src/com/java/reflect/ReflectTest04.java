package com.java.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest04 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("com.java.reflect.Student");
        System.out.println(c.getName());    //com.java.reflect.Student
        System.out.println(c.getSimpleName());  //Student

        Field[] f = c.getFields();  //获取类中公开的字段
        System.out.println(f.length);   //2

        Field[] fields = c.getDeclaredFields(); //获取类中所有的字段
        for (Field field:fields){
            int modifierNum = field.getModifiers(); //返回的是修饰符对应的数字
            String modiferName = Modifier.toString(modifierNum); //将数字转换为字符串
            System.out.println(modiferName);

            Class fileType = field.getType(); //返回值是Class类型
            String fileTypeName = fileType.getSimpleName(); //获取类型的简单名称
            System.out.println(fileTypeName);

            String fieldName = field.getName(); //返回属性名字
            System.out.println(fieldName);
        }
    }
}
