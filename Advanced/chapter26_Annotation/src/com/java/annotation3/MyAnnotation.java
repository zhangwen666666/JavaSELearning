package com.java.annotation3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//只允许这个注解出现在类上和方法上
@Target({ElementType.METHOD, ElementType.TYPE})
// 希望这个注解可以被反射
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "山西省大同市";
}
