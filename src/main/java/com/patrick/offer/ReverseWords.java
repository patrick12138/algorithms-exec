package com.patrick.offer;

import sun.plugin2.message.LaunchJVMAppletMessage;

/**
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
 * 为简单起见，标点符号和普通字母一样处理。
 * 例如输入字符串"I am a student. "，则输出"student. a am I"。
 */
public class ReverseWords {
    public static String reverseWords(String s) {
        int i = 0, j = s.length() - 1;
        s.trim();
        char[] chars = s.toCharArray();
        while (i < j) {
            i++;
            j--;
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        for (char aChar : chars) {
            System.out.print(aChar);
        }
        return new String(chars);
    }

    /**
     * java正则表达式暴力
     *
     * @param s
     * @return
     */
    public static String reverseWords2(String s) {
        String[] split = s.split("[\\s]+");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            stringBuilder.append(split[i] + " ");
        }
        return stringBuilder.toString().trim();
    }

    /**
     * 双指针
     * ON
     * ON
     *
     * @param s
     * @return
     */
    public static String reverseWords1(String s) {
        s = s.trim(); // 删除首尾空格
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') i--; // 搜索首个空格
            res.append(s.substring(i + 1, j + 1) + " "); // 添加单词
            while (i >= 0 && s.charAt(i) == ' ') i--; // 跳过单词间空格
            j = i; // j 指向下个单词的尾字符
        }
        return res.toString().trim(); // 转化为字符串并返回
    }

    public static void main(String[] args) {
        String s = "the   sky     is    blue";
        System.out.println(reverseWords1(s));
    }
}
