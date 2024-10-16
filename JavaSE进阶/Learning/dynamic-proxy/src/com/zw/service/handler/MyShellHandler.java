package com.zw.service.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 必须实现InvocationHandler接口，完成代理类要做的功能
public class MyShellHandler implements InvocationHandler {
    private Object target = null;

    // 动态代理：目标对象是活动的，需要传入进来
    public MyShellHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = null;
        // 执行目标对象的方法
        // 相当于静态代理中 float price = factory.sell(amount);
        res = method.invoke(target, args);

        // 功能增强
        if (res != null){
            Float price =(Float) res;
            price += 25;
            res = price;
        }
        System.out.println("商家给你一个优惠劵");
        return res;
    }
}
