package com.Array;

public class Test03 {
    public static void main(String[] args) {
        Object[] objs = {new Object(), new Object(), new Object()};
        Object[] newObjs = new Object[5];
        System.arraycopy(objs, 0, newObjs, 0, objs.length);
        for (int i = 0; i < newObjs.length; i++) {
            System.out.print(newObjs[i] + "  ");
            //java.lang.Object@1d81eb93  java.lang.Object@7291c18f  java.lang.Object@34a245ab  null  null
        }


        int[] src = {1, 13, 3, 24, 6, 8}; //拷贝源
        int[] dest = new int[10];
        //从src中下标为1的位置开始拷贝，拷贝到dest中下种为3的位置，拷贝4个元素
        System.arraycopy(src, 1, dest, 3, 4);
        for (int i = 0; i < dest.length; i++) {
            System.out.print(dest[i] + " "); //0 0 0 13 3 24 6 0 0 0
        }
    }
}
