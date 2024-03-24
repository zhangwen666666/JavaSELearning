package com.string;

public class Test02 {
    public static void main(String[] args) {
        byte[] bytes = "abcdef".getBytes();
        for(int i = 0; i < bytes.length; i++){
            System.out.print(bytes[i] + " ");   //97 98 99 100 101 102
        }
        System.out.println();

        String s1 = "anf";
        System.out.println(s1.isEmpty());  // false
        String s2 = "";
        System.out.println(s2.isEmpty());  // true

        String[] ymd = "1980-10-11".split("-"); //"1980-10-11"以"-"分隔符进行拆分。
        for(int i = 0; i < ymd.length; i++){
            System.out.print(ymd[i] + "  ");    //1980  10  11
        }
        System.out.println();
        String param = "name=zhangsan&password=123&age=20";
        String[] params = param.split("&");
        for(int i = 0; i <params.length; i++){
            System.out.print(params[i] + "  ");  // name=zhangsan  password=123  age=20
            // 可以继续向下拆分，可以通过“=”拆分。
        }
        System.out.println();

        char[] chars = "我是中国人".toCharArray();
        for(int i = 0; i < chars.length; i++){
            System.out.print(chars[i] + "  ");  // 我  是  中  国  人
        }
        System.out.println();

        System.out.println("ABCDefKXyz".toLowerCase()); // abcdefkxyz

        System.out.println("ABCDefKXyz".toUpperCase()); // ABCDEFKXYZ

        System.out.println("           hello      world             ".trim());  //hello      world

        System.out.println("ABc".equalsIgnoreCase("abC"));
    }
}
