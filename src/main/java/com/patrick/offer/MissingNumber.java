package com.patrick.offer;

import java.util.Arrays;

/**
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
 * 在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 */
public class MissingNumber {
    /**
     * 需要二分查找
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        return 0;
    }

    public int missingNumber1(int[] nums) {
        //计算出0-n的和  n*(n+1)/2
        int sum = nums.length * (nums.length + 1) / 2;
        return sum - Arrays.stream(nums).sum();
    }

    public static void main(String[] args) {

    }
}
