package com.zw.service;

// 厂家，商家都要完成的功能
public interface UsbSell {
    // amount：一次购买的数量
    // 返回值：一个u盘的价格
    float sell(int amount);

}
