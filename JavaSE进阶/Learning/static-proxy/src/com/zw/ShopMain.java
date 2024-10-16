package com.zw;

import com.zw.shangjia.TaoBao;
import com.zw.shangjia.WeiShang;

public class ShopMain {
    public static void main(String[] args) {
        // 通过淘宝购买U盘
        TaoBao taoBao = new TaoBao();
        float price1 = taoBao.sell(1);
        System.out.println("通过淘宝购买，单价是：" + price1);

        // 通过微商购买U盘
        WeiShang weiShang = new WeiShang();
        float price2 = weiShang.sell(1);
        System.out.println("通过微商购买，单价是：" + price2);
    }
}
