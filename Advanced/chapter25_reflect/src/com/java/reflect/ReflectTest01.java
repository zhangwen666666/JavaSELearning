package com.java.reflect;

import java.util.Date;
import java.util.List;

public class ReflectTest01 {
    public static void main(String[] args) {
        try {
            Class c1 = Class.forName("java.lang.String");
            System.out.println(c1); //class java.lang.String
            Class c2 = Class.forName("java.util.Scanner");
            System.out.println(c2); //class java.util.Scanner
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Class c3 = "abc".getClass();
        System.out.println(c3); //class java.lang.String
        Date time = new Date();
        Class c4 = time.getClass();
        System.out.println(c4); //class java.util.Date

        Class c5 = Date.class;
        System.out.println(c5); //class java.util.Date
        Class c6 = List.class;
        System.out.println(c6); //interface java.util.List
        Class c7 = int.class;
        System.out.println(c7); //int
    }
}
