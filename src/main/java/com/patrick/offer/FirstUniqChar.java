package com.patrick.offer;

import java.util.*;

/**
 * 在字符串 s 中找出第一个只出现一次的字符。
 * 如果没有，返回一个单空格。 s 只包含小写字母。
 */
public class FirstUniqChar {
    /**
     * 第一个字符，我没搞到，没解出来了暴力解法
     *
     * @param s
     * @return
     */
    public static char firstUniqChar(String s) {
        if (s.length() == 0 || s == " ") return ' ';
        HashSet<Character> set = new HashSet<>();
        int j = 0;
        char repeat = ' ';
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (!set.add(s.charAt(i))) {
                chars[j++] = s.charAt(i);
            }
        }
        for (Character character : set) {
            for (char aChar : chars) {
                if (aChar != character) {
                    repeat = character;
                }
            }
        }
        return repeat;
    }

    /**
     * 哈希表
     * 时间复杂度O（N）：N为字符串s的长度；需遍历s两轮，使用O（N）；HashMap 查找操作的复杂度为O（1）；
     * 空间复杂度O（1）：由于题目指出s只包含小写字母，因此最多有26个不同字符，HashMap 存储需占用O（26）=O（1）的额外空间。
     * @param s
     */
    public static char firstUniqChar1(String s) {
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] sc = s.toCharArray();
        for (char c : sc)
            dic.put(c, !dic.containsKey(c));//反过来为了第一个不重复的是true直接输出
        for (char c : sc)
            if (dic.get(c)) return c;
        return ' ';
    }

    /**
     * 有序哈希表
     *
     * @param s
     * @return
     */
    public static char firstUniqChar2(String s) {
        Map<Character, Boolean> dic = new LinkedHashMap<>();
        char[] sc = s.toCharArray();
        for (char c : sc)
            dic.put(c, !dic.containsKey(c));
        Set<Map.Entry<Character, Boolean>> entries = dic.entrySet();
        for (Map.Entry<Character, Boolean> entry : entries) {
            if (entry.getValue()) return entry.getKey();
        }
        return ' ';
    }

    public static void main(String[] args) {
        String s = "aabbcccddf";
        System.out.println(firstUniqChar(s));
    }
}
