package com.java.io.decorator;

public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Bird fly");
    }
}
