package com.random;

import java.util.Arrays;
import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        int[] arr = generateRandom(5,5);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] generateRandom(int num, int bound) {
        int[] arr = new int[num];
        int count = 0;
        Random r = new Random();
        while (count < num) {
            int temp = r.nextInt(bound);
            boolean flag = false; //假设生成的随机数与数组中的都不同
            for (int i = 0; i < count; i++) { //循环遍历数组中的每个数
                if (arr[i] == temp){ //如果生成的随机数与数组中下标为i的元素相等
                    flag = true; //相同
                    break;
                }
            }
            if(flag) //如果相等，跳过本次循环
                continue;
            arr[count++] = temp;
        }
        return arr;
    }
}
