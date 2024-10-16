package com.zw.service.factory;

import com.zw.service.UsbSell;

public class UsbKingFactory implements UsbSell {

    @Override
    public float sell(int mount) {
        System.out.println("目标类中，执行sell目标方法");
        return 85f;
    }

    @Override
    public void print() {
        System.out.println("接口中另一个方法的实现");
    }
}
