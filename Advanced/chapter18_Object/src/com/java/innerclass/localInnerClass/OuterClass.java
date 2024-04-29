package com.java.innerclass.localInnerClass;

public class OuterClass {
    private int i = 100;
    private static int j = 200;

    public void m1(){
        int k = 20; //这里需要final修饰，但JDK8之后不要手动添加了
        //局部内部类
        class LocalInnerClass{
            public void doSome(){
                System.out.println(i);
                System.out.println(j);
                System.out.println(k);
            }

            public static void doOther(){
                //System.out.println(i);//err doOther()是静态方法
                System.out.println(j);
            }
        }
        //k++;//如果这里修改了k的值，上边doSome()方法中输出k会报错
        //局部内部类的生命周期很短，必须在m1()方法体里使用
        LocalInnerClass.doOther();//调用局部内部类的静态方法
        LocalInnerClass lic = new LocalInnerClass();//创建局部内部类对象
        lic.doSome();//调用局部内部类的实例方法
    }


    public static void m2(){
        //局部内部类
        class LocalInnerClass{
            public void doSome(){
                //System.out.println(i);//err m2()方法是静态的
                System.out.println(j);
            }

            public static void doOther(){
                //System.out.println(i);//err m2()方法是静态的
                System.out.println(j);
            }
        }
        //局部内部类的生命周期很短，必须在m2()方法体里使用
        LocalInnerClass.doOther();//调用局部内部类的静态方法
        LocalInnerClass lic = new LocalInnerClass();//创建局部内部类对象
        lic.doSome();//调用局部内部类的实例方法
    }


    public static void main(String[] args) {
        //访问实例方法中的局部内部类的实例方法
        OuterClass oc = new OuterClass();//创建外部类对象
        oc.m1();//使用实例方法中的局部内部类
        OuterClass.m2();//使用静态方法中的局部内部类
    }
}
