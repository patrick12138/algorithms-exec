package com.patrick.test;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            arrayList.add(null);
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
