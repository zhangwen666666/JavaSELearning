package com.homework6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*6.定义一个泛型为String类型的List集合，统计该集合中每个字符
        （注意，不是字符串）出现的次数。例如：集合中有”abc”、”bcd”两个元素，
        程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。*/
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("acdef");
//        arrayList.add("ajsdlak");
//        arrayList.add("dkakldwl");
//        arrayList.add("dsjeif");

        arrayList.add("abc");
        arrayList.add("bcd");

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < arrayList.size(); i++) { //获取List中的每一个String类型元素
            String s = arrayList.get(i);
            for (int j = 0; j < s.length(); j++) { //获取当前String对象的每一个字符
                char c = s.charAt(j);
                if (map.containsKey(c)) {
                    int count = map.get(c);
                    map.replace(c, count + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }

        //遍历Map集合
        Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character,Integer> elem: entrySet){
            System.out.println(elem.getKey() + " = " + elem.getValue());
        }
    }


}
