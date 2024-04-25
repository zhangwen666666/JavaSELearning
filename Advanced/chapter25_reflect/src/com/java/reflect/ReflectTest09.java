package com.java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ReflectTest09 {
    public static void main(String[] args) throws Exception {
        StringBuilder s = new StringBuilder();
        Class c = Class.forName("java.lang.String");
        s.append(Modifier.toString(c.getModifiers()));
        s.append(" class ");
        s.append(c.getSimpleName());
        s.append(" {\n");
        Constructor[] constructors = c.getDeclaredConstructors();//获取所有构造方法
        for (Constructor constructor : constructors) {
            s.append("\t");
            s.append(Modifier.toString(constructor.getModifiers()));//获取修饰符列表
            s.append(" ");
            //构造方法名 与类名一致，如果直接使用constructor.getName()得到的是完整类名
            s.append(c.getSimpleName());
            s.append("(");
            Class[] parameterTypes = constructor.getParameterTypes();//获取形参类型
            for (Class parameterType : parameterTypes) {
                s.append(parameterType.getSimpleName());
                s.append(",");
            }
            if (parameterTypes.length > 0)
                s.deleteCharAt(s.length() - 1);
            s.append("){}\n");
        }
        s.append("}");
        System.out.println(s);
    }
}
