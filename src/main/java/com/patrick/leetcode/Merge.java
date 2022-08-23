package com.patrick.leetcode;

import java.util.Arrays;

public class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = 0; i < m + n; i++) {
            if (nums1[i] == 0 && j < n) {
                nums1[i] = nums2[j++];
            }
        }
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    /***
     * 逆向双指针
     * O M+N
     * O 1
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int tail = nums1.length - 1;
        int p1 = m - 1;
        int p2 = n - 1;
        while (p2 >= 0) {
            if (p1 < 0 || nums1[p1] <= nums2[p2]) {
                nums1[tail--] = nums2[p2--];
            } else {
                nums1[tail--] = nums1[p1--];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 3, 0, 0, 0};
        int[] arr2 = {2, 4, 6};
        int m = 3, n = 3;
        merge(arr1, m, arr2, n);
    }
}
