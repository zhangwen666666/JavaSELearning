package com.java.reflect;

public class ReflectTest11 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("java.lang.String");
        Class superClass = c.getSuperclass();   //获取父类
        System.out.println(c.getSimpleName() + "的父类是：" + superClass.getSimpleName());
        Class[] interfaces = c.getInterfaces();
        System.out.println("String类实现的接口有：");
        for (Class in : interfaces){
            System.out.println(in.getName());
        }
    }
}
