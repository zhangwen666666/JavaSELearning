package com.java.lambda;

// 情况一：无返回值无参数
@FunctionalInterface
interface NoParameterNoReturn {
    void test();
}

public class Test02 {
    public static void main(String[] args) {
        // 方式一：使用匿名内部类来实现
        NoParameterNoReturn obj1 = new NoParameterNoReturn() {
            @Override
            public void test() {
                System.out.println("无参无返回值");
            }
        };
        obj1.test();

        // 方式二：使用Lambda表达式来实现
        NoParameterNoReturn obj2 = () -> System.out.println("无参无返回值");
        obj2.test();
    }
}