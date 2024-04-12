package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "zhaoliu");

        //使用entrySet方法将Map集合转换为Set集合
        Set<Map.Entry<Integer, String>> set = map.entrySet();

        //使用迭代器遍历Set集合
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> elem = it.next();
            Integer key = elem.getKey();
            String value = elem.getValue();
            System.out.println(key + "=" + value);
        }

        //使用foreach遍历Set集合
        for(Map.Entry<Integer,String> elem: set){
            Integer key = elem.getKey();
            String value = elem.getValue();
            System.out.println(key + "=" + value);
        }

/*        // 获取所有的key
        Set<Integer> keyset = map.keySet();

        // 通过Iterator迭代器来遍历
        Iterator<Integer> it = keyset.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        // foreach遍历
        for (Integer i : keyset) {
            String s = map.get(i);
            System.out.println(i + "=" + s);
        }*/
    }
}

