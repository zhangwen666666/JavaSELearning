package com.java.lambda;

import java.util.Arrays;
import java.util.function.Function;

public class Test15 {
    public static void main(String[] args) {
        Function<Integer,int[]> function = new Function<Integer, int[]>() {
            @Override
            public int[] apply(Integer integer) {
                return new int[integer];
            }
        };
        int[] nums = function.apply(10);
        System.out.println(Arrays.toString(nums));

        Function<Integer,int[]> function1 = integer -> new int[integer];
        int[] nums1 = function1.apply(5);
        System.out.println(Arrays.toString(nums1));

        Function<Integer,int[]> function2 = int[]::new;
        int[] nums2 = function2.apply(3);
        System.out.println(Arrays.toString(nums2));

    }
}
