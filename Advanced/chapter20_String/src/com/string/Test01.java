package com.string;

public class Test01 {
    public static void main(String[] args) {
        byte[] bytes = {97, 98, 99};
        String s2 = new String(bytes,1,2); //bc
        System.out.println(s2);

        String s1 = new String(bytes);
        System.out.println(s1); //abc

        // 将char数组全部转换成字符串
        char[] chars = {'我','是','中','国','人'};
        String s4 = new String(chars);
        System.out.println(s4);

        // 将char数组的一部分转换成字符串
        String s5 = new String(chars, 2, 3);
        System.out.println(s5);

        String s6 = new String("helloworld!");
        System.out.println(s6); //helloworld!

        int result = "abc".compareTo("abc");
        System.out.println(result); //0（等于0） 前后一致

        int result2 = "abcd".compareTo("abch");
        System.out.println(result2); //-4（小于0） 前小后大

        int result3 = "abce".compareTo("abcd");
        System.out.println(result3); // 1（大于0） 前大后小

        System.out.println("HelloWorld.java".contains(".java")); // true
        System.out.println("http://www.baidu.com".contains("https://")); // false

        System.out.println("test.txt".endsWith(".java")); // false
        System.out.println("test.txt".endsWith(".txt")); // true
        System.out.println("fdsajklfhdkjlsahfjkdsahjklfdss".endsWith("ss")); // true

        System.out.println("abc".equals("abc")); // true

    }
}
