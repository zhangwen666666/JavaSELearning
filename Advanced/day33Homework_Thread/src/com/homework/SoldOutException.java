package com.homework;

public class SoldOutException extends Exception {
    public SoldOutException() {
    }

    public SoldOutException(String msg) {
        super(msg);
    }
}
