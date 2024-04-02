package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(1);

        //在指定位置上插入元素  效率低，用的比较少
        l.add(1, "hello"); //在下标为1的位置上插入"hello"

        Object o = l.get(1);
        System.out.println(o);  //hello

        //list集合特殊的遍历方式
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");   // 1 hello 2 4 1
        }
        System.out.println();

        //获取指定对象第一次出现时的索引
        int first = l.indexOf(1);
        System.out.println(first);  // 0

        //获取指定对象最后一次出现时的索引
        int last = l.lastIndexOf(1);
        System.out.println(last);   // 4

        //删除指定下标位置处的元素
        l.remove(0);
        System.out.println(l.size());   // 4

        //修改指定位置处的元素
        l.set(0, "hi");
        System.out.println(l.get(0));   // hi

    }
}
