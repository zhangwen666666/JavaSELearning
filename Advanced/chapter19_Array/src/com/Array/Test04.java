package com.Array;

public class Test04 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {8, 20, 5, 9, 7},
                {6},
                {4, 10}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(arr.length); //4
    }
}
