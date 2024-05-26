package a;

import annotation.Column;

public class Student {
    @Column(name = "age", type = "int")
    private int age;
    @Column(name = "name")
    private String name;
}
