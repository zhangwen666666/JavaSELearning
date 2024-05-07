package com.ArraysUtil;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class ArraysTest {
    @Test
    public void testToString() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));

        Animal[] animals = {new Animal(), new Animal(), new Animal()};
        System.out.println(Arrays.toString(animals));

        int[][] arrs = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.toString(arrs));
    }

    @Test
    public void testDeepToString() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6}, {7}};
        System.out.println(Arrays.deepToString(arr));
    }

    @Test
    public void testEquals() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.equals(arr1, arr2));

        Animal[] animals1 = {new Animal("jack"), new Animal("stac")};
        Animal[] animals2 = {new Animal("jack"), new Animal("stac")};
        System.out.println(Arrays.equals(animals1, animals2));

        int[][] arr3 = {{1, 2, 3, 4}, {5, 6}, {7}};
        int[][] arr4 = {{1, 2, 3, 4}, {5, 6}, {7}};
        System.out.println(Arrays.equals(arr3, arr4));
        System.out.println(Arrays.deepEquals(arr3, arr4));
    }

    @Test
    public void testHashCode() {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.hashCode(arr1));
        Animal[] animals1 = {new Animal("jack"), new Animal("stac")};
        Animal[] animals2 = {new Animal("jack"), new Animal("stac")};
        System.out.println(Arrays.hashCode(animals1));
        System.out.println(Arrays.hashCode(animals2));
//        System.out.println(new Animal("jack").hashCode());
//        System.out.println(new Animal("stac").hashCode());
        Animal[][] animals = {animals1, animals2};
        System.out.println(Arrays.hashCode(animals));
        System.out.println(Arrays.deepHashCode(animals));
        System.out.println(Arrays.deepHashCode(animals));
    }

    @Test
    public void testSort() {
        Animal[] animals2 = {new Animal("zack"), new Animal("stac")};
        Arrays.sort(animals2);
        System.out.println(Arrays.toString(animals2));
        Arrays.sort(animals2, new AnimalComparator());
        System.out.println(Arrays.toString(animals2));
    }

    @Test
    public void testCopyOf() throws CloneNotSupportedException {
//        Person[] p1 = {new Person("张三"), new Person("李四"),
//                new Person("王五"), new Person("赵六")};
//        Person[] p2 = Arrays.copyOf(p1, 2);
//        System.out.println(Arrays.toString(p2));
//        Person[] p3 = Arrays.copyOfRange(p1,1,5);
//        System.out.println(Arrays.toString(p3));
//        p1[1]=new Person("zhanghwen");
//        System.out.println(Arrays.toString(p2));
//        System.out.println(Arrays.toString(p3));

        Address address = new Address("天津","西青");
        Person[] p4 =  {new Person("张三",address), new Person("李四",address),
                new Person("王五",address), new Person("赵六",address)};
        Person[] p5 = Arrays.copyOf(p4, 2);
        System.out.println(Arrays.toString(p5));
        Person[] p6 = Arrays.copyOfRange(p4,1,5);
        System.out.println(Arrays.toString(p6));

        p4[1].addr.city = "背景";

        System.out.println(Arrays.toString(p5));
        System.out.println(Arrays.toString(p6));

        Person person1 = new Person("张三",new Address("天津市","西青区"));
        Person person2 = person1.clone();
        System.out.println(person1);
        System.out.println(person2);

        person1.addr.city="北京市";
        System.out.println(person1);
        System.out.println(person2);
    }

}

class Animal implements Comparable {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return this.name.equals(animal.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return name.compareTo(((Animal) o).name);
    }

    public static void main(String[] args) {
        m1();
//        m2();
        System.out.println(m3());
    }

    private static int m3() {
        int i = 10;
        try{
            return i;
        }
        finally {
            i++;
        }
    }

    public static int m1(){
        try{
            System.out.println("try语句块");
            return 1;
        }finally {
            System.out.println("finally语句块");
        }
    }

    public static int m2(){
        try{
            System.out.println("try语句块");
            System.exit(0);
        }finally {
            System.out.println("finally语句块");
        }
        return 1;
    }


}

class AnimalComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Animal animal1 = (Animal) o1;
        Animal animal2 = (Animal) o2;
        return animal2.getName().compareTo(animal1.getName());
    }
}

class Person implements Cloneable{
    String name;
    Address addr;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", addr=" + addr +
                '}';
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        Address address = person.addr.clone();
        person.addr = address;
        return person;
    }
}

class Address implements Cloneable{
    String city;
    String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}