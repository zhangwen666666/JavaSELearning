package com.java.innerclass.staticinnerclass;

public class OuterClass {
    private static int i = 100;
    private static void m1(){
        System.out.println("外部类的静态方法");
    }

    //静态内部类
    private static class StaticInnerClass{
        //在静态内部类中可以访问外部类的静态变量和静态方法
        public void doSome(){
            System.out.println(i);
            m1();
        }

        public static void doOther(){
            System.out.println("静态内部类的静态方法");
        }
    }

    public static void main(String[] args) {
        //创建内部类对象
        OuterClass.StaticInnerClass c = new OuterClass.StaticInnerClass();
        //调用内部类对象的实例方法
        c.doSome();
        //直接调用静态内部类的静态方法
        OuterClass.StaticInnerClass.doOther();
    }
}
