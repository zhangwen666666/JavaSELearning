package com.java.lambda;

import java.util.Comparator;
import java.util.function.Function;

public class Test12 {
    public static void main(String[] args) {
        // 方式一：使用匿名内部类来实现
        Teacher teacher = new Teacher("ande", 18);
        Function<Teacher, String> function1 = new Function<Teacher, String>() {
            @Override
            public String apply(Teacher teacher) {
                return teacher.getName();
            }
        };
        System.out.println(function1.apply(teacher));

        // 方式二：使用Lambda表达式来实现
        Function<Teacher, String> function2 = e -> e.getName();
        System.out.println(function2.apply(teacher));

        // 方式三：使用方法引用来实现
        Function<Teacher, String > function3 = Teacher :: getName;
        System.out.println(function3.apply(teacher));
    }
}
