package com.java.reflect;

import java.lang.reflect.Constructor;

public class ReflectTest10 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.java.reflect.Cat");
        Object obj = c.newInstance(); //调用无参数构造方法

        Constructor c1 = c.getDeclaredConstructor(String.class, int.class);//两个参数的构造方法
        Object obj1 = c1.newInstance("小花", 7);
        System.out.println(obj1);//Cat{name='小花', age=7, sex=true}

        Constructor c2 = c.getDeclaredConstructor();//无参构造
        Object obj2 = c2.newInstance();
        System.out.println(obj2);//Cat{name='null', age=0, sex=false}

        Constructor c3 = c.getDeclaredConstructor(String.class, boolean.class);
        Object obj3 = c3.newInstance("招财", true);
        System.out.println(obj3);//Cat{name='招财', age=0, sex=true}

        Constructor c4 = c.getDeclaredConstructor(String.class, int.class, boolean.class);
        Object obj4 = c4.newInstance("小兰",5,false);
        System.out.println(obj4);//Cat{name='小兰', age=5, sex=false}
    }
}
