package com.patrick.offer;

import java.util.*;

/**
 * https://leetcode.cn/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class MajorityElement {
    /**
     * 米奇妙妙屋解法
     * 摩尔投票法
     *
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        int x = 0, votes = 0;
        for (int num : nums) {
            if (votes == 0) x = num;
            votes += num == x ? 1 : -1;
        }
        return x;
    }

    /**
     * 整活解法,排序，然后中间数字为众数
     * 快排 O NLOGN
     */
    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    /**
     * map其实靠getOrDefault方法的
     * @param nums
     * @return
     */
    public static int majorityElement2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        map.forEach((key, val) -> System.out.println(key + "->" + val));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > (nums.length / 2)) return entry.getKey();
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {6, 6, 6, 7, 7};
        majorityElement(arr);
        System.out.println();
    }
}
