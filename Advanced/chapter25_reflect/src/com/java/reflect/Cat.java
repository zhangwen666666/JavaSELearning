package com.java.reflect;

public class Cat {
    String name;
    int age;
    boolean sex;

    public Cat() {}
    public Cat(int age) { this.age = age;}
    public Cat(String name, int age) {
        this(name,age,true);
    }
    public Cat(String name, boolean sex) {
        this.name = name;
        this.sex = sex;
    }
    public Cat(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public void move(String name, String action) {
        System.out.println(name + "正在" + action);
    }

    public void move(String action){
        System.out.println("猫正在" + action);
    }

    public boolean fly(){
        return true;
    }
}
