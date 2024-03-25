package com.Integer;

public class Test01 {
    public static void main(String[] args) {
        Integer i1 = new Integer(21);
        System.out.println(i1);
        Integer i2 = new Integer("32");
        System.out.println(i2);

        Long l1 = new Long(12L);
        System.out.println(l1);
        Long l2 = new Long("21474836478");
        System.out.println(l2);

        System.out.println("byte的最大值" + Byte.MAX_VALUE);    //127
        System.out.println("byte的最小值" + Byte.MIN_VALUE);    //-128
        System.out.println("int的最大值" + Integer.MAX_VALUE);  //2147483647
        System.out.println("int的最小值" + Integer.MIN_VALUE);  //-2147483648
        System.out.println("short的最大值" + Short.MAX_VALUE);  //32767
        System.out.println("short的最小值" + Short.MIN_VALUE);  //-32768

        Integer a = 10;
        Integer b = 10;
        System.out.println(a == b); //true

        Short x1 = 128;
        Short y1 = 128;
        System.out.println(x1 == y1);

        int x = Integer.parseInt("123",4);
        System.out.println(x);  //27


        Integer x2 = Integer.valueOf(200);
        Integer y2 = Integer.valueOf(200);
        System.out.println(x2 == y2);

        Integer z1 = Integer.valueOf(200);
        System.out.println(z1); //200
        Integer z2 = Integer.valueOf("123");
        System.out.println(z2); //123
        Integer z3 = Integer.valueOf("123", 4);
        System.out.println(z3); //21
        Integer.toString(1);
    }
}
