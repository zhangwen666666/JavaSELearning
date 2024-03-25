package com.Integer;

public class Test02 {
    public static void main(String[] args) {
        int i = 10;
        String s = String.valueOf(i);
        System.out.println(s + 20);

        int x = Integer.parseInt(s);
        System.out.println(x + 20);

        Integer i1 = Integer.valueOf(2);
        int i2 = i1.intValue();

        String s2 = String.valueOf(i1);
        Integer i3 = Integer.valueOf(s2);
    }
}
