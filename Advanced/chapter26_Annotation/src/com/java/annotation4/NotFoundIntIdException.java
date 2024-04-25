package com.java.annotation4;

public class NotFoundIntIdException extends Exception{
    public NotFoundIntIdException() {
    }

    public NotFoundIntIdException(String message) {
        super(message);
    }
}
