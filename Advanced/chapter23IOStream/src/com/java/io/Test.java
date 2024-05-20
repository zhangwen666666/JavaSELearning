package com.java.io;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String name = null;
        double price = 0.0;
        boolean couponalbe = false;
        Scanner scanner = new Scanner(System.in);

    }
}

class Product{
    private double price;
    private String name;
    private boolean couponable;

    public Product(double price, String name, boolean couponable) {
        this.price = price;
        this.name = name;
        this.couponable = couponable;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


