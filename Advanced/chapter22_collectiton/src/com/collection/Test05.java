package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test05 {
    public static void main(String[] args) {
/*        Collection c = new ArrayList();
        // 这里获取的迭代器，指向的是那个没有元素状态下的迭代器
        Iterator it = c.iterator();
        c.add(1);
        c.add(2);
        c.add(3);
        System.out.println(it.hasNext());
        while(it.hasNext()){
            // 集合结构发生改变，迭代器没有重新获取，会发生ConcurrentModificationException异常
            Object o = it.next();
            System.out.println(o);
        }*/

        Collection c = new ArrayList();
        c.add("abc");
        c.add("def");
        c.add("hij");
        Iterator it = c.iterator();
        while(it.hasNext()){
            String s = (String)it.next();

            //删除元素之后，集合的结构发生了变化，应该重新去获取迭代器
            //但是，循环下一次的时候并没有重新获取迭代器，再调用next()方法时
            //所以会出现异常java.util.ConcurrentModificationException
            //c.remove(s);

            //使用迭代器的remove方法
            it.remove(); //删除的是迭代器当前所指向的对象
            System.out.println(s);
        }
        System.out.println("集合中元素的个数为：" + c.size()); //0
    }
}
