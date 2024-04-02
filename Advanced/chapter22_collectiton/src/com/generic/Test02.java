package com.generic;

public class Test02 {
    public static void main(String[] args) {
        Integer[] arr1 = {2, 5, 7, 8};
        Printer.print(arr1);    //2 5 7 8

        Double[] arr2 = {3.14, 1.03, 4.51};
        Printer.print(arr2);    //3.14 1.03 4.51

        String[] arr3 = {"abc", "def", "hij"};
        Printer.print(arr3);    //abc def hij
    }
}

class Printer {
    public static <T> void print(T[] array) {
        if (array == null) {
            System.out.println("数组为空");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}