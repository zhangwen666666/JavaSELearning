package com.zw.factory;

import com.zw.service.UsbSell;

public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        // 一个U盘是 85元
        return 85f;
    }
}
