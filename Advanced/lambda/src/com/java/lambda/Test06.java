package com.java.lambda;

// 情况二：有返回值一个参数
interface OneParameterHasReturn {
    String test(double num);
}

public class Test06 {
    public static void main(String[] args) {
        // 方式一：使用匿名内部类来实现
        OneParameterHasReturn obj1 = new OneParameterHasReturn() {
            @Override
            public String test(double num) {
                return "传入的小数为：" + num;
            }
        };
        System.out.println(obj1.test(520.0));

        // 方式二：使用Lambda表达式来实现
        OneParameterHasReturn obj2 = num -> "传入的小数为：" + num;
        System.out.println(obj2.test(1314.0));
    }
}
