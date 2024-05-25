package com.java.generic;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class GenericTest04 {
    public static void main(String[] args) throws Exception {
        Class<MyClass> c = MyClass.class;
        //获取方法
        Method method = c.getDeclaredMethod("m1", List.class, Map.class);
        //获取方法参数上的泛型
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            //如果使用了泛型
            if (genericParameterType instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) genericParameterType;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (Type type : actualTypeArguments) {
                    System.out.println(type.getTypeName());
                    //java.lang.String
                    //java.lang.Integer
                    //java.lang.Object
                }
            }
        }
    }
}
