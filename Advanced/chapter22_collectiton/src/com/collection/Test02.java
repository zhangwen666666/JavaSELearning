package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Test02 {
    public static void main(String[] args) {
        Collection c = new ArrayList(); // 后面的集合无所谓，主要是看Collection这个接口
        c.add(100);
        c.add("zhangsan");
        c.add(new Object());

        Iterator it = c.iterator(); //获取集合对象的迭代器对象，迭代器最初没有指向任何一个元素
        while(it.hasNext()){    //只要it.hasNext()返回true，说明还没有遍历到最后
            Object o = it.next();   //让迭代器前进一位，并且将指向的元素返回
            System.out.println(o);
        }

        Collection c2 = new HashSet();
        // 无序：存进去和取出的顺序不一定相同。
        // 不可重复：存储100，不能再存储100.
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(90);
        c2.add(400);
        c2.add(50);
        c2.add(60);
        c2.add(100);
        Iterator it2 = c2.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
