package com.java.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.util.ResourceBundle;

public class ReflectTest05 {
    public static void main(String[] args) throws Exception{
        StringBuilder code = new StringBuilder();
        ResourceBundle bundle = ResourceBundle.getBundle("classInfo");  //读配置文件
        String className =  bundle.getString("className");  //获取类名
        Class c = Class.forName(className); //获取类名对应的.class
        code.append(Modifier.toString(c.getModifiers()));   //追加类修饰符列表
        code.append(" class ");
        code.append(c.getSimpleName()); //追加类名
        code.append(" {\n");
        Field[] fields = c.getDeclaredFields();
        for(Field field:fields){
            code.append("\t");
            code.append(Modifier.toString(field.getModifiers()));   //追加属性修饰符
            code.append(" ");
            code.append(field.getType().getSimpleName());//追加属性类型
            code.append(" ");
            code.append(field.getName());   //追加属性名
            code.append(";\n");
        }
        code.append("}");
        System.out.println(code);
    }
}
