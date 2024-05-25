package com.java.generic;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

class Student {
    public Student(List<Boolean> list, Map<Integer, Double> map) {
    }
}

public class GenericTest06 {
    public static void main(String[] args) throws Exception {
        Class<Student> c = Student.class;
        //获取构造方法
        Constructor<?> constructor = c.getDeclaredConstructor(List.class, Map.class);
        //获取构造方法参数上的泛型
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        for (Type g : genericParameterTypes) {
            //如果该参数使用了泛型
            if (g instanceof ParameterizedType){
                ParameterizedType parameterizedType = (ParameterizedType) g;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for(Type type:actualTypeArguments){
                    System.out.println(type.getTypeName());
                    //java.lang.Boolean
                    //java.lang.Integer
                    //java.lang.Double
                }
            }
        }
    }
}
