package com.number;

import java.math.BigDecimal;

public class Test02 {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal(200);
        BigDecimal num2 = new BigDecimal(100);
        System.out.println(num1 + "+" + num2 + "=" + num1.add(num2));   //200+100=300
        System.out.println(num1 + "-" + num2 + "=" + num1.subtract(num2));  //200-100=100
        System.out.println(num1 + "*" + num2 + "=" + num1.multiply(num2));  //200*100=20000
        System.out.println(num1 + "/" + num2 + "=" + num1.divide(num2));    //200/100=2
    }
}
