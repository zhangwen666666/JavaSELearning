package com.java.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;

public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws Exception{
        Student s1 = new Student("张三",20);
        Student s2 = new Student("李四",30);
        System.out.println(s1);
        FileOutputStream fos = new FileOutputStream("E:\\object");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);
        oos.writeObject(s2);

        oos.flush();
        oos.close();
    }
}

class Student implements Serializable {
    private String name;
    private transient int age;
    private boolean sex;

    public static final long serialVersionUID = 1L;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
