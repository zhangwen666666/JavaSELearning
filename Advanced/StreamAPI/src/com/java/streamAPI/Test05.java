package com.java.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Test05 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Stream<Integer> stream = list.stream();
        System.out.println(stream.reduce(Math::multiplyExact).get());

        Stream<Integer> stream1 = list.stream();
        System.out.println(stream1.filter(num -> num >= 3).reduce(Math::subtractExact).get());

        Stream<String> stream2 = Stream.of("123", "abcd", "f", "dhjsk", "hij", "mngjk");
        System.out.println(stream2.reduce((s1, s2) -> s1.length() >= s2.length() ? s1 : s2).get());

        Stream<Student> stream3 = StudentData.getStudentList().stream();
        System.out.println(stream3.map(Student::getAge).filter(age -> age <= 20).reduce(Math::addExact).get());

        Stream<Integer> stream4 = list.stream();
        Integer reduce = stream4.reduce(10, Math::addExact);
        System.out.println(reduce);

        System.out.println(list.stream().count());
        System.out.println(list.size());
        System.out.println(list.stream().max(Integer::compareTo).get());

        Stream<Student> stream5 = StudentData.getStudentList().stream();
        System.out.println(stream5.max((o1, o2) -> o2.getAge() - o1.getAge()).get());

    }
}
