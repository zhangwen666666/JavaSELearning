package com.java.lambda;

import java.util.function.Supplier;

public class Test10 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("ande", 18);
        // 方式一：使用匿名内部类来实现
        Supplier<String> supplier1 = new Supplier<String>() {
            @Override
            public String get() {
                return teacher.getName();
            }
        };
        System.out.println(supplier1.get());

        // 方式二：使用Lambda表达式来实现
        Supplier<String> supplier2 = () -> teacher.getName();
        System.out.println(supplier2.get());

        // 方式三：使用方法引用来实现
        Supplier<String> supplier3 = teacher :: getName;
        System.out.println(supplier3.get());
    }
}

class Teacher{
    private String name;
    private int age;

    public Teacher(){}

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
