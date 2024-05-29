package com.java.lambda;

@FunctionalInterface
interface MoreParameterNoReturn {
    void test(int num1, int num2);
}

public class Test04 {
    public static void main(String[] args) {
        // 方式一：使用匿名内部类来实现
        MoreParameterNoReturn obj1 = new MoreParameterNoReturn() {
            @Override
            public void test(int num1, int num2) {
                System.out.println("无返回值多个参数 --> " + num1 + "、" + num2);
            }
        };
        obj1.test(10, 100);

        // 方式二：使用Lambda表达式来实现
        MoreParameterNoReturn obj2 = (num1, num2) -> System.out.println("无返回值多个参数 --> " + num1 + "、" + num2);
        obj2.test(20, 200);
    }
}
