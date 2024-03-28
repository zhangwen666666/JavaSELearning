package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test03 {
    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            m1();
            // 以上代码出现异常，直接进入catch语句块中执行。
            System.out.println("hello world!");
        } catch (FileNotFoundException e){ // catch后面的好像一个方法的形参。
            // 这个分支中可以使用e引用，e引用保存的内存地址是那个new出来异常对象的内存地址。
            // catch是捕捉异常之后走的分支。
            // 在catch分支中干什么？处理异常。
            System.out.println("文件不存在，可能路径错误，也可能该文件被删除了！");
            System.out.println(e); //java.io.FileNotFoundException: D:\course\01-课\学习方法.txt (系统找不到指定的路径。)
        }
        // try..catch把异常抓住之后，这里的代码会继续执行。
        System.out.println("main over");
    }

    // 抛别的不行，抛ClassCastException说明你还是没有对FileNotFoundException进行处理
    //private static void m1() throws ClassCastException{
    // 抛FileNotFoundException的父对象IOException，这样是可以的。因为IOException包括FileNotFoundException
    //private static void m1() throws IOException {
    // 这样也可以，因为Exception包括所有的异常。
    //private static void m1() throws Exception{
    // throws后面也可以写多个异常，可以使用逗号隔开。
    //private static void m1() throws ClassCastException, FileNotFoundException{
    private static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        // 编译器报错原因是：m2()方法声明位置上有：throws FileNotFoundException
        // 我们在这里调用m2()没有对异常进行预处理，所以编译报错。
        // m2();

        m2();
        // 以上如果出现异常，这里是无法执行的！
        System.out.println("m1 over");
    }

    private static void m2() throws FileNotFoundException {
        // 创建一个输入流对象，该流指向一个文件。
        //编译报错的原因是什么？
        //  第一：这里调用了一个构造方法：FileInputStream(String name)
        //  第二：这个构造方法的声明位置上有：throws FileNotFoundException
        //  第三：通过类的继承结构看到：FileNotFoundException父类是IOException，IOException的父类是Exception，
        //  最终得知，FileNotFoundException是编译时异常。
        //  错误原因？编译时异常要求程序员编写程序阶段必须对它进行处理，不处理编译器就报错。
        //new FileInputStream("D:\\course\\01-开课\\学习方法.txt");

        // 我们采用第一种处理方式：在方法声明的位置上使用throws继续上抛。
        // 一个方法体当中的代码出现异常之后，如果上报的话，此方法结束。
        new FileInputStream("D:\\course\\01-课\\学习方法.txt");

        System.out.println("如果以上代码出异常，这里会执行吗??????????????????不会！！！");
    }
}
