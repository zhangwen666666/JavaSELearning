package com.java.newFeature;

sealed class Person permits Teacher {
}

non-sealed class Teacher extends Person{}

class ATeacher extends Teacher{}