package com.generic;

public class Test03 {
    public static void main(String[] args) {
        Person<String,Integer> p1 = new Person<>("张三",20);
        System.out.println(p1);  //Person{name=张三, age=20}

        Person<String,Integer> p2 = new Person<>("李四",30);
        System.out.println(p2);  //Person{name=李四, age=30}
    }
}

class Person<NameType,AgeType>{
    private NameType name;
    private AgeType age;

    public Person(NameType name, AgeType age) {
        this.name = name;
        this.age = age;
    }

    public NameType getName() {return name;}
    public void setName(NameType name) {this.name = name;}
    public AgeType getAge() {return age;}
    public void setAge(AgeType age) {this.age = age;}

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
