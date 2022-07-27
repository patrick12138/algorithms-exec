package com.patrick.leetcode;

/**
 * 力扣005
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * 示例 1：
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 * 输入：s = "cbbd"
 * 输出："bb"
 */
public class LongestPalindromicSubstring {
    private int start = 0, maxLength = 1;

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            expandAroundCenter(s, i - 1, i + 1);
            expandAroundCenter(s, i, i + 1);
        }

        return s.substring(start, start + maxLength);
    }

    private void expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        String test = "babad";
        String test1 = "cbbbd";
        System.out.println(new LongestPalindromicSubstring().longestPalindrome(test));
        System.out.println(new LongestPalindromicSubstring().longestPalindrome(test1));
    }
}
