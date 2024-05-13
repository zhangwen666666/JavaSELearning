package com.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.ResourceBundle;

public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "a");
        hashtable.put(2, "b");
        hashtable.put(3, "c");

        //获取所有的key的迭代器
        Enumeration<Integer> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer key = keys.nextElement();
            System.out.print(key + " ");    //3 2 1
        }

        //获取所有的value的迭代器
        Enumeration<String> values = hashtable.elements();
        while (values.hasMoreElements()) {
            String s = values.nextElement();
            System.out.print(s + " ");  //c b a
        }

        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(null,null);
    }
}
