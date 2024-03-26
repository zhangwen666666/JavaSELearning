package com.enum2;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(divide(10, 1));
    }

    //判断给定的两个整数是否能相除，能的话返回1，不能则返回0
    public static int divide(int num1, int num2) {
        try {
            int ret = num1 / num2;
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
}
