package com.patrick.offer;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class ReplaceSpace {
    /**
     * @param s
     * @return
     */
    public static String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        char[] charsReplace = new char[chars.length * 3];
        for (int i = 0; i < chars.length; i++) {
            charsReplace[i] = chars[i];
            if (chars[i] == ' ') {
                chars[i] = '%';
            }
        }
        return new String(charsReplace);
    }

    public static String replaceSpace1(String s) {
        int length = s.length();
        char[] array = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++] = c;
            }
        }
        return new String(array,0,size);
    }

    public static void main(String[] args) {
        String s = "We are happy";
        System.out.println(replaceSpace1(s));
    }
}
