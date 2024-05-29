package com.java.lambda;

// 情况二：无返回值一个参数
@FunctionalInterface
interface OneParameterNoReturn {
    void test(int num);
}

public class Test03 {
    public static void main(String[] args) {
        // 方式一：使用匿名内部类来实现
        OneParameterNoReturn obj1 = new OneParameterNoReturn() {
            @Override
            public void test(int num) {
                System.out.println("无返回值一个参数 --> " + num);
            }
        };
        obj1.test(10);

        // 方式二：使用Lambda表达式来实现
        OneParameterNoReturn obj2 = num -> System.out.println("无返回值一个参数 --> " + num);
        obj2.test(20);
    }
}