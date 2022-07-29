package com.patrick.test;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapTest {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"2");
        linkedHashMap.put(2,"2");
        linkedHashMap.put(3,"2");
        Set<Map.Entry<Integer, String>> entries = linkedHashMap.entrySet();
        entries.forEach(System.out::println);
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(3);
        hashSet.forEach(System.out::println);
        boolean b = linkedHashMap.containsKey(1);
        linkedHashMap.forEach((key,value)-> System.out.println(key + value));
    }
}
