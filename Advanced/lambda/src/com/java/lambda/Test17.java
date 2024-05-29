package com.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Test17 {
    public static void main(String[] args) {
        //创建set集合
        List<Integer> list = Arrays.asList(122,321,45,76,3,5,6);
        Set<Integer> set = new TreeSet<>(list);

        //使用匿名内部类+forEach()遍历
        set.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        System.out.println("================");
        //使用Lambda表达式+forEach()遍历
        set.forEach(integer -> System.out.println(integer));

        System.out.println("================");
        //使用方法引用 + forEach()遍历
        set.forEach(System.out::println);
    }
}
