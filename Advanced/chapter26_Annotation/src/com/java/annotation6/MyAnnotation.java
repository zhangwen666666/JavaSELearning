package com.java.annotation6;

import java.lang.annotation.Repeatable;

@Repeatable(MyAnnotations.class)
public @interface MyAnnotation {
    String name();
}

@interface MyAnnotations{
    MyAnnotation[] value();
}

class Test{
    @MyAnnotation(name="张三")
    @MyAnnotation(name="李四")
    public void m(){}
}