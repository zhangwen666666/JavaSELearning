package com.java.streamAPI;

import java.util.stream.Stream;

public class Test04 {
    public static void main(String[] args) {
        Stream<Student> stream = StudentData.getStudentList().stream();
        stream.sorted((s1,s2)->s1.getName().compareTo(s2.getName())).forEach(System.out::println);
    }
}
