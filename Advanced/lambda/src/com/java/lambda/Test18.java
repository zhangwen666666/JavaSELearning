package com.java.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Test18 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"王五");
        map.put(3,"李四");
        map.put(4,"王八");

        //采用匿名内部类+forEach()遍历
        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println(integer + "=" + s);
            }
        });

        System.out.println("===========");

        //采用精简的Lambda表达式+forEach()遍历
        map.forEach((integer,s)-> System.out.println(integer + "=" + s));
    }
}
