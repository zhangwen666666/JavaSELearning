package com.zw.interceptor;

import com.zw.factory.UsbKingFactory;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object ret = methodProxy.invokeSuper(o, objects);
        System.out.println("这里可以做事务增强");
        return ret;
    }
}
