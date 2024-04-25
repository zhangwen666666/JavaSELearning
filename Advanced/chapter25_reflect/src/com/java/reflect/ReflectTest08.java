package com.java.reflect;

import java.lang.reflect.Method;

public class ReflectTest08 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("com.java.reflect.Cat");
        Object obj = c.newInstance();

        //获取方法 区分方法包括方法名和形参列表
        Method method = c.getDeclaredMethod("move",String.class,String.class);
        method.invoke(obj,"小花","走猫步");  //调用方法

        //调用其他两个方法
        Method method1 = c.getDeclaredMethod("move",String.class);
        method1.invoke(obj,"跳舞");

        Method method2 = c.getDeclaredMethod("fly");
        Object returnValue =  method2.invoke(obj);
        System.out.println(returnValue);
    }
}
