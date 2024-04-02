package com.generic;

public class Test03 {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>();
        p1.setE("张三");
        System.out.println(p1.getE());  //张三

        Person<Integer> p2 = new Person<>();
        p2.setE(20);
        System.out.println(p2.getE());  // 20
    }
}

class Person<E>{
    E e;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
