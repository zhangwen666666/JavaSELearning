package com.java.reflect;

public class ReflectTest02 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.java.reflect.User");
            System.out.println(c);  //class com.java.reflect.User
            Object o = c.newInstance();
            System.out.println(o);  //com.java.reflect.User@10f87f48
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
