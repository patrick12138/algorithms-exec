package com.patrick.leetcode;

import java.util.HashSet;

/**
 * 力扣003
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int j = 0, maxLength = 0;
        if (s == null || s.length() == 0) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                maxLength = Math.max(maxLength, set.size());
            } else {
                while (set.contains(s.charAt(i))) {
                    set.remove(s.charAt(j));
                    j++;
                }
                set.add(s.charAt(i));
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcdddf";
        String s1 = "abcabcdeabcddd";

        System.out.println(lengthOfLongestSubstring(s));
    }
}
