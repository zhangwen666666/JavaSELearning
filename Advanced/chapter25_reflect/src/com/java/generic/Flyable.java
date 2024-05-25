package com.java.generic;

public interface Flyable<X, Y> {}

interface Eatable<X, Y>{}

class Bird implements Flyable<String, Integer>,Eatable<Boolean,Double>{}