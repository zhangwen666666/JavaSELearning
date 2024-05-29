package com.java.lambda;

// 情况三：有返回值多个参数
interface MoreParameterHasReturn {
    String test(int num1, int num2);
}
public class Test07 {
    public static void main(String[] args) {
        // 方式一：使用匿名内部类来实现
        MoreParameterHasReturn obj1 = new MoreParameterHasReturn() {
            @Override
            public String test(int num1, int num2) {
                return "运算的结果为：" + (num1 + num2);
            }
        };
        System.out.println(obj1.test(10, 20));

        // 方式二：使用Lambda表达式来实现
        MoreParameterHasReturn obj2 = (num1, num2) -> "运算的结果为：" + (num1 + num2);
        System.out.println(obj2.test(20, 30));
    }
}
