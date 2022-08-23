package com.patrick.offer;

/**
 * https://leetcode.cn/problems/gou-jian-cheng-ji-shu-zu-lcof/
 * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，
 * 其中 B[i] 的值是数组 A 中除了下标 i 以外的元素的积,
 * 即 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 */
public class ConstructArr {
    public int[] constructArr(int[] a) {
        int[] arr = new int[a.length];
        int sum = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == a[i]) sum *= a[i];
            }
        }
        arr[0] = sum;
        return arr;
    }

    /**
     * 帅的
     * @param a
     * @return
     */
    public static int[] constructsArr1(int[] a) {
        int[] res = new int[a.length];
        for (int i = 0, cur = 1; i < a.length; i++) {
            res[i] = cur;   // 先乘左边的数(不包括自己)
            cur *= a[i];
        }
        for (int re : res) {
            System.out.println(re);
        }
        for (int i = a.length - 1, cur = 1; i >= 0; i--) {
            res[i] *= cur;  // 再乘右边的数(不包括自己)
            cur *= a[i];
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
