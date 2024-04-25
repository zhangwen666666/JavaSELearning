package com.java.reflect;

public class ArgsTest {
    public static void main(String[] args) {
        m1(10, 20, 30);//10 20 30
        m1(new int[]{50, 60, 70, 80});//50 60 70 80
        int[] arr1 = new int[]{10, 20};
    }

    private static void m1(int... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }
}

