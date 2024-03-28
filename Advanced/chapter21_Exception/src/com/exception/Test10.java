package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class Test10 {
    public static void main(String[] args) {

    }
}

class Animal{
    public void move() throws IOException {}
}

class Bird extends Animal{
    public void move() throws FileNotFoundException, FileSystemException,NullPointerException {

    }
}
