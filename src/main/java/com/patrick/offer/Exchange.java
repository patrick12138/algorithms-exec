package com.patrick.offer;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
 */
public class Exchange {
    /**
     * 双指针就完事了
     * 时间复杂度 O(N)O(N) ： NN 为数组 numsnums 长度，双指针 ii, jj 共同遍历整个数组。
     * 空间复杂度 O(1)O(1) ： 双指针 ii, jj 使用常数大小的额外空间。
     *
     * @param nums
     * @return
     */
    public static int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1, tmp;
        while (i < j) {
            while (i < j && (nums[i] % 2) == 1) i++;
            while (i < j && (nums[j] % 2) == 0) j--;
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        for (int i : exchange(nums)) {
            System.out.print(i);
        }
    }
}
