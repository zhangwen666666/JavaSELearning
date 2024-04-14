package com.homework1;

import java.util.ArrayList;
import java.util.Random;

public class Homework01 {
    //1.产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();
//        System.out.println(arr.length);
        for (int i = 0; i < 10; i++) {
            int randint = random.nextInt(100) + 1;
            arr[i] = randint;
            if (randint >= 10)
                arrayList.add(randint);
        }

        System.out.println("arr:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("arrayList:");
        for (Integer i : arrayList) {
            System.out.print(i + " ");
        }
    }
}
