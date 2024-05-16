package com.java.io.decorator;

public class Test {
    public static void main(String[] args) {
        Flyable f1 = new TimerDecorator(new Cat());
        Flyable f2 = new TimerDecorator(new Bird());
        f1.fly();
        f2.fly();

        Flyable f3 = new PrinterDecorator(new Cat());
        Flyable f4 = new PrinterDecorator(new Bird());
        f3.fly();
        f4.fly();
    }
}
