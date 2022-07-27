package com.patrick.offer;

/**
 *一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 */
public class NumWays {
    /**
     * 自己试错写的，大概
     * @param n
     * @return
     */
    public int numWays(int n) {
        if (n == 0 || n == 1) return 1;
        if (n == 2) return 2;
        int f0 = 1;
        int f1 = 2;
        int temp = 0;
        for (int i = 2; i < n; i++) {
            temp = f0 + f1;
            f0 = f1;
            f1 = temp % 1000000007;
        }
        return f1;
    }

    public static void main(String[] args) {

    }
}
