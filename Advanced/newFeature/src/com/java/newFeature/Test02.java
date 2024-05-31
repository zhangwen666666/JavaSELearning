package com.java.newFeature;

import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
        Stream<String> stream = "abv\ndef\nfhj".lines();
        System.out.println(stream.count());
        int $ = 10;
    }
}
