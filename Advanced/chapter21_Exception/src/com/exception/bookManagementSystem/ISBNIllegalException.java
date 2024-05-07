package com.exception.bookManagementSystem;

public class ISBNIllegalException extends Exception{
    public ISBNIllegalException() {
    }

    public ISBNIllegalException(String message) {
        super(message);
    }
}
