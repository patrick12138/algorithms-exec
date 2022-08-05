package com.patrick.test;

import java.util.*;

public class LinkedHashMapTest {

    public static void main(String[] args) {
//        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
//        linkedHashMap.put(1, "2");
//        linkedHashMap.put(2, "2");
//        linkedHashMap.put(3, "2");
//        Set<Map.Entry<Integer, String>> entries = linkedHashMap.entrySet();
//        for (Map.Entry<Integer, String> entry : entries) {
//            System.out.println(entry.getKey() + entry.getValue());
//        }
//        entries.forEach(System.out::println);
//        HashSet<Integer> hashSet = new HashSet<>();
//        hashSet.add(1);
//        hashSet.add(5);
//        hashSet.add(3);
//        hashSet.forEach(System.out::println);
//        boolean b = linkedHashMap.containsKey(1);
//        linkedHashMap.forEach((key, value) -> System.out.println(key + value));

        HashMap<Integer, Integer> map = new HashMap<>();
        Integer put = map.put(1, 1);
        Integer put1 = map.put(2, 1);
        Integer put2 = map.put(3, 1);
        Integer put3 = map.put(3, 1);
        Integer put4 = map.put(1, 3);
        System.out.println(map.get(5));
        System.out.println(map.getOrDefault(2, 0));
        System.out.println(put);
        System.out.println(put1);
        System.out.println(put2);
        System.out.println(put3);
        System.out.println(put4);

    }
}
