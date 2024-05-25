package com.java.generic;


import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Scanner;

class C{
    public Map<Integer, Scanner> m(){
        return null;
    }
}

public class GenericTest05 {
    public static void main(String[] args) throws Exception{
        Class<C> c = C.class;
        //获取方法
        Method method = c.getDeclaredMethod("m");
        //获取返回值上的泛型
        Type genericReturnType = method.getGenericReturnType();
        //如果方法的返回值使用了泛型
        if(genericReturnType instanceof ParameterizedType){
            //向下转型
            ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
            //获取实际的泛型
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for(Type type:actualTypeArguments){
                System.out.println(type.getTypeName());
            }
        }
    }
}
