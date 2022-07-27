package com.patrick.array;

/**
 * 删除排序数组中的重复项
 * 二分
 */
public class Test01 {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int count = 1;
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[index - 1]) {
                continue;
            }
            nums[index] = nums[i];
            index++;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
}
