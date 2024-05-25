package com.java.annotation5;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnnotation {
}

@MyAnnotation
class Animal{

}


class Bird extends Animal{

}


class Test{
    public static void main(String[] args) {
        Class<Bird> c = Bird.class;
        MyAnnotation annotation = c.getAnnotation(MyAnnotation.class);
        System.out.println(annotation);//@com.java.annotation5.MyAnnotation()
    }
}