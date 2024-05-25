package com.java.generic;

import java.lang.reflect.Method;

public class GenericTest07 {
    public static void main(String[] args) throws Exception{
        Class<?> c = MyException.class;
        Method m = c.getDeclaredMethod("m");
        System.out.println(m);
    }
}
