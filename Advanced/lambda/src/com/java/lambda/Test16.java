package com.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test16 {
    public static void main(String[] args) {
        //创建List集合
        List<Integer> list = Arrays.asList(12, 43, 54, 1, 4, 6, 58, 10);

        //使用匿名内部类+forEach()遍历
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer);
            }
        });

        //使用Lambda表达式+forEach()遍历
        list.forEach(integer -> System.out.print(integer));

        //使用方法引用 + forEach()遍历
        list.forEach(System.out::println);
    }
}
