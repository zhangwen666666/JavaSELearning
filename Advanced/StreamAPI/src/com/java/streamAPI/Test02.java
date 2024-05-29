package com.java.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("abc", "def", "xyz");
        stream1.map(new Function<String, String>() {

            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(System.out::println);

        Stream<String> stream2 = Stream.of("abcd", "def", "xyz");
        stream2.map(String::toUpperCase).filter(s -> s.length() > 3).forEach(System.out::println);

        Stream<Student> stream3 = StudentData.getStudentList().stream();
        stream3.map(Student::getName).forEach(System.out::println);

        Stream<Student> stream4 = StudentData.getStudentList().stream();
        stream4.filter(stu -> "男".equals(stu.getSex())).map(Student::getName).forEach(System.out::println);

        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(43);
        list1.add(56);

        List<Integer> list2 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        list1.add(6);

        Stream<List<Integer>> stream5 = Stream.of(list1, list2);
        stream5.flatMap(List::stream).forEach(System.out::println);
    }
}
