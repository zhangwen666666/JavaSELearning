package com.java.io.decorator;

public class CatSub extends Cat{
    @Override
    public void fly(){
        long start = System.currentTimeMillis();
        super.fly();
        long end = System.currentTimeMillis();
        System.out.println("fly()方法一共执行了" + (end - start) + "ms");
    }
}
