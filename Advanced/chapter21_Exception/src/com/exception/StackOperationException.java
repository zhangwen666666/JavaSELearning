package com.exception;

//定义了一个编译时异常，栈操作异常
public class StackOperationException extends Exception{
    public StackOperationException(){}

    public StackOperationException(String s){
        super(s);
    }
}
