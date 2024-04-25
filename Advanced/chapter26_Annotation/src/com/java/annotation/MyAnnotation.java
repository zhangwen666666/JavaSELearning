package com.java.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Deprecated
//@Target(value={METHOD,})
public @interface MyAnnotation {

}

//注解出现在注解类型上
@MyAnnotation
@interface OtherAnnotation{

}