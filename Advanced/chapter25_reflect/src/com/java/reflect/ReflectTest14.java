package com.java.reflect;

public class ReflectTest14 {
    public static void main(String[] args) {
        //获取应用类加载器(系统类加载器)
        ClassLoader appClassLoader = ReflectTest14.class.getClassLoader();
        ClassLoader appClassLoader2 = ClassLoader.getSystemClassLoader();
        ClassLoader appClassLoader3 = Thread.currentThread().getContextClassLoader();

        //jdk.internal.loader.ClassLoaders$AppClassLoader@36baf30c
        System.out.println(appClassLoader);
        //jdk.internal.loader.ClassLoaders$AppClassLoader@36baf30c
        System.out.println(appClassLoader2);
        //jdk.internal.loader.ClassLoaders$AppClassLoader@36baf30c
        System.out.println(appClassLoader3);

        //获取平台类加载器
        ClassLoader platformClassLoader = appClassLoader.getParent();
        //jdk.internal.loader.ClassLoaders$PlatformClassLoader@b4c966a
        System.out.println(platformClassLoader);

        //获取启动类加载器
        ClassLoader bootstrapClassLoader = platformClassLoader.getParent();
        System.out.println(bootstrapClassLoader);//null
        System.out.println(bootstrapClassLoader.getParent());
    }
}
