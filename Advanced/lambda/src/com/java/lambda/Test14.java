package com.java.lambda;

import java.util.function.Function;

public class Test14 {
    public static void main(String[] args) {
        // 方式一：使用匿名内部类来实现
        Function<String, Teacher> function1 = new Function<String, Teacher>() {
            @Override
            public Teacher apply(String name) {
                return new Teacher(name);
            }
        };
        System.out.println(function1.apply("ande"));

        // 方式二：使用Lambda表达式来实现
        Function<String, Teacher> function2 = name -> new Teacher(name);
        System.out.println(function2.apply("ande"));

        // 方式二：使用构造方法引用来实现
        // 注意：根据重写方法的形参列表，那么此处调用了Teacher类name参数的构造方法
        Function<String, Teacher> function3 = Teacher :: new;
        System.out.println(function3.apply("ande"));
    }
}
