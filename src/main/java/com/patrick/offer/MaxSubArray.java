package com.patrick.offer;

/**
 * https://leetcode.cn/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * 要求时间复杂度为O(n)。不能暴力
 */
public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
//            maxSum += nums[i];
            maxSum = Math.max(maxSum, maxSum + nums[i]);
        }
        return maxSum;
    }

    /**
     * dp 不懂嗯背
     * ON
     * O1
     * @param nums
     * @return
     */
    public static int maxSubArray1(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}
