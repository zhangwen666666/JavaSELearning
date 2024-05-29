package com.java.lambda;

import java.util.function.Function;

public class Test11 {
    public static void main(String[] args) {
        //// 方式一：使用匿名内部类来实现
        Function<Double,Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double value) {
                return Math.round(value);
            }
        };
        System.out.println(function.apply(3.14));

        //方式二：使用Lambda表达式来实现
        Function<Double,Long> function1 = value-> Math.round(value);
        System.out.println(function1.apply(1314.520));

        //方式三：使用方法引用来实现
        Function<Double,Long> function2 = Math::round;
        System.out.println(function2.apply(123.546));
    }
}
