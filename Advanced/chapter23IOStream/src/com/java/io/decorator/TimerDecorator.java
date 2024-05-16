package com.java.io.decorator;

public class TimerDecorator extends FlyableDecorator{
    // 这里只能写抽像的被装饰者的公共接口或抽象类
    //private Flyable flyable;//被装饰者的引用。
    public TimerDecorator(Flyable flyable){
        super(flyable);
    }

    @Override
    public void fly() {
        long start = System.currentTimeMillis();
        super.fly();
        long end = System.currentTimeMillis();
        System.out.println("fly()方法一共执行了" + (end - start) + "ms");
    }
}
