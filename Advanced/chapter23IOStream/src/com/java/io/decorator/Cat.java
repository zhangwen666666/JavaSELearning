package com.java.io.decorator;

public class Cat implements Flyable{
    @Override
    public void fly() {
        System.out.println("Cat fly");
    }
}
