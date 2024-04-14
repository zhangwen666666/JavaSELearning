package com.homework3;

import java.util.*;

/*3.分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，如果成绩一样，
        那在成绩排序的基础上按照年龄由小到大排序
        姓名（String） 年龄（int）       分数（float）
        liusan			20				90.0F
        lisi			22				90.0F
        wangwu			20				99.0F
        sunliu			22				100.0F*/
public class Main {
    public static void main(String[] args) {
//        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if (o1.getScore() == o2.getScore())
//                    return o1.getAge() - o2.getAge();
//                else if (o1.getScore() > o2.getScore())
//                    return -1;
//                else
//                    return 1;
//            }
//        });
//        treeSet.add(new Student("liusan", 20, 90.0f));
//        treeSet.add(new Student("lisi", 22, 90.0f));
//        treeSet.add(new Student("wangwu", 20, 99.0F));
//        treeSet.add(new Student("sunliu", 22, 100.0f));
//
//        for (Student s : treeSet) {
//            System.out.println(s);
//        }
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("liusan", 20, 90.0f));
        arrayList.add(new Student("lisi", 22, 90.0f));
        arrayList.add(new Student("wangwu", 20, 99.0F));
        arrayList.add(new Student("sunliu", 22, 100.0f));
        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore() == o2.getScore())
                    return o1.getAge() - o2.getAge();
                else if (o1.getScore() > o2.getScore())
                    return -1;
                else
                    return 1;
            }
        });
        Iterator<Student> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;
    private float score;

    public Student() {
    }

    public Student(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "name:" + name + " ,age:" + age + " ,score:" + score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Float.compare(score, student.score) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score);
    }

    @Override
    public int compareTo(Student o) {
        if (this.score == o.score)
            return this.age - o.age;
        else if (this.score > o.score)
            return -1;
        else
            return 1;
    }
}
