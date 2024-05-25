package com.java.generic;

import java.util.Date;

public interface Flyable<X, Y> {}

interface Eatable<X, Y>{}

class Bird implements Flyable<Date, Integer>,Eatable<Boolean,Double>{}