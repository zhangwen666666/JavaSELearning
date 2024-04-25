package com.java.annotation3;

import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) throws Exception{
        //拿到这个类
        Class c = Class.forName("com.java.annotation3.MyAnnotationTest");
        //判断类上是否有@MyAnnotation注解
        boolean result = c.isAnnotationPresent(MyAnnotation.class);
        System.out.println(result);//true
        if(result){
            //获取该注解
            Object obj = c.getAnnotation(MyAnnotation.class);
            MyAnnotation myAnnotation = (MyAnnotation) obj; // 转型

            //MyAnnotationTest类上面的注解对象：@com.java.annotation3.MyAnnotation(value="山西省大同市")
            System.out.println(c.getSimpleName() + "类上面的注解对象：" + myAnnotation);

            //获取value属性
            String value = myAnnotation.value();
            System.out.println(value);  //山西省大同市
        }

        //获取类的m()方法
        Method method = c.getDeclaredMethod("m");
        System.out.println(method); //public void com.java.annotation3.MyAnnotationTest.m()
        if(method.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
            // @com.java.annotation3.MyAnnotation(value="天津市西青区")
            System.out.println(myAnnotation);
            //获取注解对象的value值
            System.out.println(myAnnotation.value()); // 天津市西青区
        }
    }
}
