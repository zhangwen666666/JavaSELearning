package com.java.annotation;

@MyAnnotation
public class AnnotationTest01 {
    @MyAnnotation
    int i;

    @Deprecated
    public static int m1(@MyAnnotation int num){
        return num;
    }

}
