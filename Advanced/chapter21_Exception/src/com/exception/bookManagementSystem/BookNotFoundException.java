package com.exception.bookManagementSystem;

public class BookNotFoundException extends Exception{
    public BookNotFoundException() {
    }

    public BookNotFoundException(String message) {
        super(message);
    }
}
