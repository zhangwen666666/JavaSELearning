package com.java.homework;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student implements Serializable {

    public static final long serialVersionUID = 1L;

    private int no;
    private String name;
    private String sex;
    private String birthday;
    private String telphone;

    public Student() {
    }

    public Student(int no, String name, String sex, String birthday) {
        this.no = no;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name, sex, birthday);
    }

    @Override
    public String toString() {
        return no + "\t\t" + name + "\t\t" + sex + "\t\t" + birthday + "\t\t" + telphone;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "张三", "男", "2000-11-14");
        Student s2 = new Student(2, "李四", "女", "1999-02-24");
        Student s3 = new Student(3, "王五", "女", "1998-12-17");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        Map<Integer, Student> students = new HashMap<>();
        students.put(s1.getNo(), s1);
        students.put(s2.getNo(), s2);
        students.put(s3.getNo(), s3);

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("E:\\students"));
            oos.writeObject(students);
            oos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
