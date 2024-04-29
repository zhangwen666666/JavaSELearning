package com.java.innerclass.nestedClass;

public class OuterClass {
    private int i = 100;
    public void m1(){
        System.out.println("外部类的实例方法");
    }

    private static int j = 200;
    public static void m2(){
        System.out.println("外部类的静态方法");
    }

    private class NestedInnerClass{
        public void m3(){
            System.out.println(i);
            System.out.println(j);
            m1();
            m2();
        }

        public static void m4(){
            //System.out.println(i);//error
            System.out.println(j);
            //m1();//error
            m2();
        }
    }

    public static void main(String[] args) {
        //调用实例内部类的静态方法，不需要创建对象
        OuterClass.NestedInnerClass.m4();
        //创建实例内部类对象
        OuterClass oc = new OuterClass();
        OuterClass.NestedInnerClass ic = oc.new NestedInnerClass();
        //以上两行代码可以合并
        //OuterClass.NestedInnerClass ic1 = new OuterClass().new NestedInnerClass();
        ic.m3(); //调用实例内部类的实例方法
    }
}
