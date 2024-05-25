package com.java.generic;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GenericTest02 {
    public static void main(String[] args) {
        Class<Bird> c = Bird.class;

        Type[] genericInterfaces = c.getGenericInterfaces();
        for(Type genericInterface:genericInterfaces){
            if(genericInterface instanceof ParameterizedType){
                ParameterizedType parameterizedType = (ParameterizedType) genericInterface;
                Type[] types = parameterizedType.getActualTypeArguments();
                for(Type type:types){
                    System.out.println(type.getTypeName());
                }
            }
        }
    }
}
