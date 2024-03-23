package com.Array;

public class Test2 {
    public static void main(String[] args) {
        Animal[] animals = {new Animal(), new Animal()};
        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }

        Animal[] anis = {new Cat(),new Bird()};
        for (int i = 0; i < anis.length; i++) {
            anis[i].move(); //多态 调用父类型中存在的方法，不需要向下转型

            //调用子类特有的方法，需要向下转型
            if(anis[i] instanceof Cat){
                Cat c = (Cat)anis[i];
                c.catchMouse();
            } else if(anis[i] instanceof Bird){
                Bird b = (Bird)anis[i];
                b.sing();
            }
        }
    }
}

class Animal {
    public void move() {
        System.out.println("动物在移动");
    }
}

class Cat extends Animal{
    public void move(){
        System.out.println("猫在走猫步");
    }
    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}

class Bird extends Animal{
    public void move(){
        System.out.println("鸟儿在飞");
    }
    public void sing(){
        System.out.println("鸟儿在唱歌");
    }
}