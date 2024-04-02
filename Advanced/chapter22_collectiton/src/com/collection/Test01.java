package com.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(10);
        c.add(3.14);
        c.add("zhangsan");
        c.add(new Object());
        c.add(new Student());
        System.out.println("集合中共有" + c.size() + "个元素");
        c.clear();
        System.out.println("集合中共有" + c.size() + "个元素");
        c.add("helloworld");
        c.add(100L);
        System.out.println("集合中共有" + c.size() + "个元素");
        System.out.println(c.contains(100L));
        System.out.println(c.contains(100));
        System.out.println(c.isEmpty());
        System.out.println(c.remove("helloworld"));
        System.out.println("集合中共有" + c.size() + "个元素");
        c.add(10);
        c.add(3.14);
        c.add("zhangsan");
        c.add(new Object());
        c.add(new Student());
        System.out.println("集合中共有" + c.size() + "个元素");
        Object[] o = c.toArray();
        System.out.println(Arrays.toString(o));

    }
}

class Student{}
