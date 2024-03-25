package com.number;

import java.text.DecimalFormat;

public class Test01 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0000,00.#");
        String s = df.format(112671234.523); //1,12,67,12,34.5
        System.out.println(s);
    }
}
