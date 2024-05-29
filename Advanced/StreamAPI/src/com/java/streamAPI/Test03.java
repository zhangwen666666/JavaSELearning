package com.java.streamAPI;

import java.util.stream.Stream;

public class Test03 {
    public static void main(String[] args) {
        Stream<Student> stream = StudentData.getStudentList().stream();
        stream.filter(stu -> stu.getAge() > 18).map(Student::getSex).
                distinct().forEach(System.out::println);


    }
}
