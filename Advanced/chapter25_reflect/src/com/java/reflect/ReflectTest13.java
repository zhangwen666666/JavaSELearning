package com.java.reflect;

public class ReflectTest13 {
    public static void main(String[] args) throws Exception{
        //获取类加载器对象，获取的是系统类加载器(应用类加载器)
        //这个类加载器是负责加载classpath中的字节码文件的
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        //jdk.internal.loader.ClassLoaders$AppClassLoader@36baf30c
        //类加载器也是一个Java对象
        System.out.println(classLoader);

        //加载类
        Class<?> c = classLoader.loadClass("com.java.reflect.UserService");
        System.out.println(c);//class com.java.reflect.UserService
    }
}
