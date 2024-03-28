package com.exception;

public class Test09 {
    public static void main(String[] args) {
        System.out.println(m());   //100
    }

    public static int m() {
        int i = 100;
        try {
            // 这行代码出现在int i = 100;的下面，所以最终结果必须是返回100
            // return语句还必须保证是最后执行的。一旦执行，整个方法结束。
            return i;
        } finally {
            i++;
        }
    }


}
