package com.patrick.test;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
class Person {
    private String name;
    private String phoneNumber;
    // getters and setters
}

public class AllTest {
    public static void main(String[] args) {
//        HashSet<Character> set = new HashSet<>();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(1);
//        Iterator<Integer> iterator = arrayList.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next());
//        }
//        System.out.println(arrayList.size());
//        String s= "abcd";
//        set.add('a');
//        set.add('a');
//        set.add('b');
//        set.remove(s.charAt(1));
//        System.out.println(set.size());
//        System.out.println(set);
//        System.out.println('a');
//        int [] arr = new int[]{1,2,3,4};
//        System.out.println(arr.length);
//        System.out.println(s.length());

//        System.out.println("acv".compareTo("asd"));
        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(1, null);
//        map.put(1, null);
//        map.put(3, null);

        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("fuck", null);
        stringStringHashMap.forEach((key, val) -> {
            System.out.println(key + "->" + val);
        });

        List<Person> bookList = new ArrayList<>();
        bookList.add(new Person("jack", "18163138123"));
        bookList.add(new Person("martin", null));
        // 空指针异常
//        bookList.stream().collect(Collectors.toMap(Person::getName, Person::getPhoneNumber));

        String[] s = new String[]{
                "dog", "lazy", "a", "over", "jumps", "fox", "brown", "quick", "A"
        };
        List<String> list = Arrays.asList(s);
        Collections.reverse(list);
        //没有指定类型的话会报错
        s = list.toArray(new String[0]);
        for (String s1 : s) {
            System.out.println(s1);
        }

        Integer[] myArray = {1, 2, 3};
        List myList = Arrays.stream(myArray).collect(Collectors.toList());
        //基本类型也可以实现转换（依赖boxed的装箱操作）
        int[] myArray2 = {1, 2, 3};
        List myList1 = Arrays.stream(myArray2).boxed().collect(Collectors.toList());
    }
}
