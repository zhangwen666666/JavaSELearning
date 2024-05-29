package com.java.streamAPI;

import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        Stream<Student> stream1 = StudentData.getStudentList().stream();
        stream1.filter(stu -> stu.getAge() > 18).forEach(System.out::println);

        Stream<Student> stream2 = StudentData.getStudentList().stream();
        stream2.filter(stu->stu.getCity().length()==3).forEach(System.out::println);

        Stream<Student> stream3 = StudentData.getStudentList().stream();
        stream3.filter(stu -> stu.getAge()>18&&"男".equals(stu.getSex())).forEach(System.out::println);

    }
}
