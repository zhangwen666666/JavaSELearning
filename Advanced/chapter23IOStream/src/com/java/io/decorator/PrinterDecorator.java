package com.java.io.decorator;

public class PrinterDecorator extends FlyableDecorator{
    //private Flyable flyable;//被装饰者的引用
    public PrinterDecorator(Flyable flyable) {
        super(flyable);
    }

    @Override
    public void fly() {
        System.out.println("起飞前的准备工作");
        super.fly();
        System.out.println("降落前的安全检查");
    }
}
