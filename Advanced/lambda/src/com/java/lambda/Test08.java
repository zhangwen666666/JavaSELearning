package com.java.lambda;

import java.util.function.Function;

public class Test08 {
    public static void main(String[] args) {
        // 需求：实现小数取整的操作
        // 方式一：使用匿名对象来实现
        Function<Double, Long> function1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println(function1.apply(3.14));

        // 方式二：使用Lambda表达式来实现
        Function<Double, Long> function2 = aDouble -> Math.round(aDouble);
        System.out.println(function2.apply(3.14));

        // 方式三：使用方法引用来实现
        Function<Double, Long> function3 = Math :: round;
        System.out.println(function3.apply(3.14));
    }
}
