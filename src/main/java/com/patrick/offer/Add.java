package com.patrick.offer;

/**
 * https://leetcode.cn/problems/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof/
 * 位运算解决 a+b
 */
public class Add {
    public int add(int a, int b) {
        while (b != 0){
            int c = (a & b) << 1;
            a ^= b;
            b = c;
        }
        return a;
    }
}
