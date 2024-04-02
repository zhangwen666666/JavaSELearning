package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test03 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        String s1 = new String("abc");
        String s2 = new String("def");
        c.add(s1);
        c.add(s2);

        String x = new String("abc");
        System.out.println(c.contains(x));  //true
        System.out.println(c.remove(x));
    }
}
