package com.java.Interface;

public interface InterfaceTest01 {
    public final static int MAX = 100;  //常量

    default void defaultMethod(){
        System.out.println("接口中的默认方法");
    }


}

class InterfaceImpl implements InterfaceTest01{

}