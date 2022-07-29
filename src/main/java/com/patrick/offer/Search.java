package com.patrick.offer;

import java.util.HashSet;

/**
 * 统计一个数字在排序数组中出现的次数。
 */
public class Search {
    /**
     * 自己做的简单题，而且挺快的，泪目
     * 当然这道题是考察二分查找的，写出来也没用哈哈
     * 都O（N）
     *
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {
        HashSet<Integer> hashSet = new HashSet<>();
        int repeat = 0;
        for (int num : nums) {
            if (!hashSet.add(num) && num == target) {
                repeat++;
            }
        }
        if (!hashSet.contains(target)) {
            repeat = 0;
        }
        return repeat;
    }

    /**
     * 二分之查找
     *
     * @param nums
     * @param target
     * @return
     */
    public static int search1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1; // 定义target在左闭右闭的区间里，[left, right]
        while (left <= right) { // 当left==right，区间[left, right]依然有效，所以用 <=
            int middle = left + ((right - left) / 2);// 防止溢出 等同于(left + right)/2
            if (nums[middle] > target) {
                right = middle - 1; // target 在左区间，所以[left, middle - 1]
            } else if (nums[middle] < target) {
                left = middle + 1; // target 在右区间，所以[middle + 1, right]
            } else { // nums[middle] == target
                return middle; // 数组中找到目标值，直接返回下标
            }
        }
        // 未找到目标值
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5, 5, 6};
        int search = search(arr, 7);
        System.out.println(search);
    }
}
