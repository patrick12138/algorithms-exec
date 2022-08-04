package com.patrick.offer;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 */
public class ReverseLeftWords {
    /**
     * 列表遍历拼接
     * 时间空间都是O（N）
     *
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords2(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        String res = "";
        for (int i = n; i < s.length(); i++)
            res += s.charAt(i);
        for (int i = 0; i < n; i++)
            res += s.charAt(i);
        return res;
    }

    public static String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        swap(chars, n - 1, length - 1);
        swap(chars, n - 2, length - 2);
        return new String(chars, 0, length);
    }


    private static void swap(char[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * 字符串切片，整活
     * 时间空间都是O（N）
     *
     * @param s
     * @param n
     * @return
     */
    public static String reverseLeftWords1(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(reverseLeftWords1(s, 2));
    }
}
