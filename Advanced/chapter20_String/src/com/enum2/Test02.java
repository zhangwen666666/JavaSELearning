package com.enum2;

public class Test02 {
    public static void main(String[] args) {
        Result result = divide(10, 0);
        System.out.println(result == Result.SUCCESS ? "计算成功" : "计算失败");
        System.out.println(Result.SUCCESS);
    }

    public static Result divide(int num1, int num2) {
        try {
            int ret = num1 / num2;
            return Result.SUCCESS;
        } catch (Exception e) {
            return Result.FAIL;
        }
    }
}

enum Result {
    // SUCCESS 是枚举Result类型中的一个值
    // FAIL 是枚举Result类型中的一个值
    // 枚举中的每一个值，可以看做是“常量”
    SUCCESS,
    FAIL,
}