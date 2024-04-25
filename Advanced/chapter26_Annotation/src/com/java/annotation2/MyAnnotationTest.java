package com.java.annotation2;

public class MyAnnotationTest {
    public static void main(String[] args) {

    }

    @MyAnnotation(name = "zhangsan", color = "blue")
    public void doSome() {
    }

    @MyAnnotation(name = "lisi", color = "red", age = 30)
    public void doOther() {
    }

    @OtherAnnotation({17, 20, 30})
    public void m1() {
    }
}
