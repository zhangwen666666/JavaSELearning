package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Collections.synchronizedList(a);
        Collections.sort(a);
    }
}
