package com.java.lambda;

import java.util.function.Supplier;

public class Test13 {
    public static void main(String[] args) {
        // 方式一：使用匿名内部类来实现
        Supplier<Teacher> supplier1 = new Supplier<Teacher>() {
            @Override
            public Teacher get() {
                return new Teacher();
            }
        };
        System.out.println(supplier1.get());//com.java.lambda.Teacher@4e50df2e

        // 方式二：使用Lambda表达式来实现
        Supplier<Teacher> supplier2 = () -> new Teacher();
        System.out.println(supplier2.get());//com.java.lambda.Teacher@7291c18f

        // 方式二：使用构造方法引用来实现
        // 注意：根据重写方法的形参列表，那么此处调用了Teacher类的无参构造方法
        Supplier<Teacher> supplier3 = Teacher :: new;
        System.out.println(supplier3.get());//com.java.lambda.Teacher@7cc355be
    }
}
