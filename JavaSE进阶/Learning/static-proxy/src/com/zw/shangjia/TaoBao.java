package com.zw.shangjia;

import com.zw.factory.UsbKingFactory;
import com.zw.service.UsbSell;

public class TaoBao implements UsbSell {
    // 声明商家代理的厂家具体是谁
    private final UsbSell factory = new UsbKingFactory();

    @Override
    public float sell(int amount) {
        // 向厂家发送订单
        float price = factory.sell(amount); // 厂家的价格
        // 代理要增加价格
        price += 20;
        return price;
    }
}
