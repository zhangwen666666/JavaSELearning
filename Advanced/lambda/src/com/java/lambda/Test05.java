package com.java.lambda;

// 情况一：有返回值无参数
@FunctionalInterface
interface NoParameterHasReturn {
    int test();
}

public class Test05 {
    public static void main(String[] args) {
        // 方式一：使用匿名内部类来实现
        NoParameterHasReturn obj1 = new NoParameterHasReturn() {
            @Override
            public int test() {
                System.out.println("无参有返回值");
                return 1;
            }
        };
        System.out.println("匿名内部类方式：" + obj1.test());

        // 方式二：使用Lambda表达式来实现
        NoParameterHasReturn obj2 = () -> 10;
        System.out.println("Lambda表达式方式：" + obj2.test());
    }
}