package com.java.generic;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GenericTest01 {
    public static void main(String[] args) {
        //获取类
        Class<Cat> c = Cat.class;
//        Class<String> c = String.class;
        //获取父类的泛型
        Type genericSuperclass = c.getGenericSuperclass();
        System.out.println(genericSuperclass instanceof Class);//false
        System.out.println(genericSuperclass instanceof ParameterizedType);//true

        if(genericSuperclass instanceof ParameterizedType){
            //转型为参数化类型
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for(Type type:actualTypeArguments){
                System.out.println(type);
            }
            //for循环的输出结果：
            //class java.lang.String
            //class java.lang.Integer
            //class java.lang.Double
        }
    }
}
