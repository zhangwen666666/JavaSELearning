package com.random;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        Random num = new Random();

        //随机产生一个int类型取值范围内的数字。
        int i = num.nextInt();
        System.out.println(i);

        //随机产生一个0到101之间的数字，不包括101
        int x = num.nextInt(101);
        System.out.println(x);
    }
}
