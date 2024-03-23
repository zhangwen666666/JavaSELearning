package com.Array;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        //静态数组传参
        int[] a = {1, 2, 3, 4, 5};
        printArray(a);  //1 2 3 4 5
        printArray(new int[]{8, 9, 10});    // 8 9 10

        //动态数组传参
        String[] str = new String[3];
        printArray(str);    //三个null
        printArray(new String[5]);  //5个null

        printArray(args);
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
