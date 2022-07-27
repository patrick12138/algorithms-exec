package com.patrick.leetcode;

/**
 * 斐波那契数列
 * 1,1,2,3,5...
 */
public class FibonacciDP {
    public static int fib(int n) {
        if (n == 0) return 0;
        int fn0 = 0;
        int fn1 = 1;
        int temp;
        for (int i = 2; i <= n; i++) {
            temp = fn0 + fn1;
            fn0 = fn1;
            fn1 = temp % 1000000007; // 每次运算都取模 避免越界
        }
        return fn1;
    }

    public static int fibByArray(int n) {
        if (n == 0) return 0;
        int[] dp = new int[n + 1];//创建数组用于保存重组计算的数字，空间换时间
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            dp[i] %= 1000000007;
        }
        return dp[n];
    }

    public static void main(String[] args) {

    }
}
