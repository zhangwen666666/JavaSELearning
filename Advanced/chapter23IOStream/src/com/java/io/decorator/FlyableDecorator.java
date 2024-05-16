package com.java.io.decorator;

public abstract class FlyableDecorator implements Flyable{
    private Flyable flyable;
    public FlyableDecorator(Flyable flyable) {
        this.flyable = flyable;
    }

    @Override
    public void fly() {
        flyable.fly();
    }
}
