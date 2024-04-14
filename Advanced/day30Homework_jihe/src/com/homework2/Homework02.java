package com.homework2;

//2.已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
//将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来。

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Homework02 {
    public static void main(String[] args) {
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList(strs));

        HashSet<String> hashSet = new HashSet<>(linkedList);
        linkedList = new LinkedList<>(hashSet);
//        linkedList.addAll(hashSet);

//        for (String s : linkedList) {
//            System.out.println(s);
//        }
//        for (int i = 0; i < linkedList.size(); i++) {
//            for (int j = i + 1; j < linkedList.size(); j++) {
//                if (linkedList.get(i).equals(linkedList.get(j))) {
//                    linkedList.set(i, "");
//                }
//            }
//        }
//        for (String s : linkedList) {
//            System.out.println(s);
//        }

//        while (linkedList.remove("")) ;
        for (String s : linkedList) {
            System.out.println(s);
        }
//        boolean[] isRepeat = new boolean[strs.length];
//        for (int i = 0; i < strs.length; i++) {
//            isRepeat[i] = false;
//            for (int j = i + 1; j < strs.length; j++) {
//                if (strs[i].equals(strs[j])) {
//                    isRepeat[i] = true;
//                    strs[i] = null;
//                    break;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(isRepeat));

        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
