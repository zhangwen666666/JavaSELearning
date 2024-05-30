package com.java.streamAPI;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test06 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1=zhangsan", "2=wangwu", "3=lisi");
        Map<String, String> map = stream.collect(Collectors.toMap(s -> s.substring(0, s.indexOf("=")), s -> s.substring(s.indexOf("=") + 1)));
        map.forEach((s1, s2) -> System.out.printf("%s=%s\n", s1, s2));
        Set<Map.Entry<String, String>> entryMap = map.entrySet();
        for (Map.Entry<String, String> entry : entryMap) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        Stream<String> stream1 = Stream.of("zhangsan", "lisi", "wangwu");
        ArrayList<String> list = stream1.collect(Collectors.toCollection(new Supplier<ArrayList<String>>() {
            @Override
            public ArrayList<String> get() {
                return new ArrayList<>();
            }
        }));
        System.out.println(list);

        Stream<String> stream3 = Stream.of("1=zhangsan", "2=wangwu", "3=lisi");
        HashMap<String, String> map1 = stream3.map(s -> s.split("=")).
                collect(Collectors.toMap(arr -> arr[0], arr -> arr[1], (key1, key2) -> key2, HashMap::new));
        map1.forEach((key, value) -> System.out.printf("%s=%s\n", key, value));
    }
}
