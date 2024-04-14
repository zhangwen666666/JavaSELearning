package com.collection;

import java.util.Objects;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetTest02 {
    public static void main(String[] args) {
        Person p1 = new Person(18);
        Person p2 = new Person(20);
        Person p3 = new Person(5);
        Person p4 = new Person(60);
        Person p5 = new Person(31);

        TreeSet<Person> ts = new TreeSet<>();
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);
        ts.add(p5);

        Iterator<Person> it = ts.iterator();
        while(it.hasNext()){
            Person p = it.next();
            System.out.println(p);
        }
    }
}

class Person implements Comparable<Person>{
    private int age;

    //实现Comparable接口中的compareTo方法
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}