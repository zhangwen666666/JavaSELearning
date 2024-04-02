package com.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<Animal> mylist = new ArrayList<>();
        Cat c = new Cat();
        Bird b = new Bird();

        mylist.add(c);
        mylist.add(b);

        Iterator<Animal> it = mylist.iterator();
        while(it.hasNext()){
            Animal a = it.next();
            a.move();
        }
    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("鸟儿在飞");
    }
}

class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}
