package com.patrick.offer;

import java.util.HashSet;

/**
 * https://leetcode.cn/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 */
public class LengthOfLongestSubstring {
    /**
     * 滑动窗口
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        if (s == null) return 0;
        int j = 0, length = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                length = Math.max(length, set.size());
            } else {
                while (set.contains(s.charAt(i))) {
                    set.remove(s.charAt(j));
                    j++;
                }
                set.add(s.charAt(i));
            }
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
