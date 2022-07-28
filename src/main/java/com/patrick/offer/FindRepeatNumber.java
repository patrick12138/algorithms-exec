package com.patrick.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 */
public class FindRepeatNumber {
    /**
     * 时间空间都是O(n)
     *
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }

    /**
     * 空间O(1)
     * 遍历数组 nums，设索引初始值为 i = 0:
     * 原因：在一个长度为n的数组nums里的所有数字都在0~n-1的范围内数组元素的索引和值是一对多的关系，因此可建立索引和值的映射
     *
     * 若 nums[i] = i： 说明此数字已在对应索引位置，无需交换，因此跳过；
     * 若 nums[nums[i]] = nums[i] ： 代表索引 nums[i] 处和索引 i 处的元素值都为 nums[i] ，即找到一组重复值，返回此值 nums[i] ；
     * 否则： 交换索引为 i 和 nums[i] 的元素值，将此数字交换至对应索引位置。
     * 若遍历完毕尚未返回，则返回 -1 。
     * @param nums
     */
    public int findRepeatNumber1(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i) {
                i++;
                continue;
            }
            if (nums[nums[i]] == nums[i]) return nums[i];
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
