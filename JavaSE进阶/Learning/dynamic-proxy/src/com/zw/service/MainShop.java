package com.zw.service;

import com.zw.service.factory.UsbKingFactory;
import com.zw.service.handler.MyShellHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainShop {
    public static void main(String[] args){
        // 创建代理对象，使用Proxy
        // 1. 创建目标对象
        UsbSell factory = new UsbKingFactory();
        // 2. 创建InvocationHandler对象
        InvocationHandler handler = new MyShellHandler(factory);
        // 3.创建代理对象
        ClassLoader classLoader = factory.getClass().getClassLoader();
        Class<?>[] interfaces = factory.getClass().getInterfaces();

        UsbSell proxy = (UsbSell) Proxy.newProxyInstance(
                classLoader,
                interfaces, handler);
        // 4. 通过代理对象执行目标方法
        float price = proxy.sell(1);
        System.out.println(price);

    }
}
