package com.patrick.offer;

/**
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。
 */
public class MyPow {
    /**
     * 递归
     * 快速幂
     * @param x
     * @param n
     * @return
     */
    public static double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n == -1) return 1 / x;
        double half = myPow(x, n / 2);
        double mod = myPow(x, n % 2);
        return half * half * mod;
    }

    public static void main(String[] args) {
        System.out.println(myPow(3, 2));
    }
}
