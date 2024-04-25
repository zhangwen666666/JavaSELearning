package com.java.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest07 {
    public static void main(String[] args) throws Exception {
        StringBuilder s = new StringBuilder();
        Class c = Class.forName("java.lang.String");
        s.append(Modifier.toString(c.getModifiers()));
        s.append(" class ");
        s.append(c.getSimpleName());
        s.append("{\n");
        Method[] methods = c.getDeclaredMethods();//获取所有的方法
        for (Method method : methods) {
            s.append("\t");
            s.append(Modifier.toString(method.getModifiers()));//获取方法修饰符
            s.append(" ");
            s.append(method.getReturnType().getSimpleName());//获取返回值类型
            s.append(" ");
            s.append(method.getName());//获取方法名
            s.append("(");
            Class[] parameterTypes = method.getParameterTypes();//获取形参的修饰符
            for (Class parameterType : parameterTypes) {
                s.append(parameterType.getSimpleName());
                s.append(",");
            }
            //去掉多余的一个“，”
            if (parameterTypes.length > 0)
                s.deleteCharAt(s.length() - 1);
            s.append("){}\n");
        }
        s.append("}");
        System.out.println(s);
    }
}
