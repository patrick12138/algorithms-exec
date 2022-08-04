package com.patrick.acm;
/**
 * ACM模式
 * 2、有序数组去重
 * 给定一个字符串，字符串是有序的整数集合，逗号相连，移除相同的数字，使每个数字只出现一次，输出最终的数字个数。
 */

import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        int count = 0;
        for (int i = 0; i < str.length - 1; i++) {
            if (str[i].equals(str[i + 1])) {
                count++;
            }
        }
        System.out.println(str.length - count);
    }
}