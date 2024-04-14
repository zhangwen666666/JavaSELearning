package com.collection;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("zhangsan");
        ts.add("lisi");
        ts.add("wangwu");
        ts.add("zhangsi");
        ts.add("wangliu");

        for (String s : ts) {
            //按照字典顺序升序排序
            //lisi wangliu wangwu zhangsan zhangsi
            System.out.print(s + " ");
        }
    }
}
