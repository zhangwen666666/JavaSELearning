package com.java.lambda;

import java.util.function.Consumer;

public class Test09 {
    public static void main(String[] args) {
        // 方式一：使用匿名内部类来实现
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        };
        consumer1.accept("hello world");

        // 方式二：使用Lambda表达式来实现
        Consumer<String> consumer2 = str -> System.out.println(str);
        consumer2.accept("hello world");

        // 方式三：使用方法引用来实现
        Consumer<String> consumer3 = System.out :: println;
        consumer3.accept("hello world");
    }
}
