package com.java.lambda;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        set.add(15);
        set.add(18);
        set.add(20);
        set.add(10);

        System.out.println(set);

        Set<Integer> set2 = new TreeSet<>((o1, o2) -> o2 - o1);

        set2.add(56);
        set2.add(78);
        set2.add(31);
        set2.add(99);

        System.out.println(set2);
    }
}
