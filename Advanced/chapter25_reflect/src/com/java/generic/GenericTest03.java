package com.java.generic;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GenericTest03 {
    public static void main(String[] args) throws Exception {
        Class<User> c = User.class;
        //获取属性上的泛型，需要先获取属性
        Field mapField = c.getDeclaredField("map");
        //获取属性上的泛型
        Type genericType = mapField.getGenericType();
        //如果使用了泛型
        if(genericType instanceof ParameterizedType){
            //向下转型
            ParameterizedType parameterizedType = (ParameterizedType) genericType;
            //获取具体的类型
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for(Type type:actualTypeArguments){
                System.out.println(type.getTypeName());
                //java.lang.Integer
                //java.lang.String
            }
        }
    }
}
