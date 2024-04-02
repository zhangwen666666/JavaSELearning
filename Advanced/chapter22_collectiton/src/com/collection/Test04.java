package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String s1 = new String("hello");
        c.add(s1);
        System.out.println("列表中元素个数：" + c.size()); //1
        String s2 = new String("hello");
        c.remove(s2);
        System.out.println("列表中元素个数：" + c.size()); //0
    }
}
