package com.java.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test19 {
    public static void main(String[] args) {
        // 创建List集合并添加元素
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 2, 321, 45, 176, 3, 5, 6, 77));

        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 100;
            }
        });
        System.out.println(list);

        list.removeIf(integer -> integer < 10);
        System.out.println(list);
    }
}
