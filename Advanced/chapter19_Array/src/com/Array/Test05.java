package com.Array;

public class Test05 {
    public static void main(String[] args) {
        //动态初始化传参
        int[][] arr1 = new int[3][4];
        printArray(arr1);
        printArray(new int[2][6]);

        //静态初始化传参
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9}};
        printArray(arr2);
        printArray(new int[][]{{9, 8, 7}, {6, 5, 4, 3, 2}, {1, 0}});
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
