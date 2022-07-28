package com.patrick.offer;

import java.util.Arrays;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * <p>
 * 给你一个可能存在重复元素值的数组numbers，它原来是一个升序排列的数组，并按上述情形进行了一次旋转。请返回旋转数组的最小元素。例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一次旋转，该数组的最小值为 1。  
 * <p>
 * 注意，数组 [a[0], a[1], a[2], ..., a[n-1]] 旋转一次 的结果为数组
 * [a[n-1], a[0], a[1], a[2], ..., a[n-2]] 。
 */
public class MinArray {
    /**
     * 暴力解法，纯暴力
     *
     * @param numbers
     * @return
     */
    public static int minArray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    /**
     * 排序数组的查找问题首先考虑使用 二分法 解决，其可将 遍历法 的 线性级别 时间复杂度降低至 对数级别
     * ·时间复杂度O（1og2N）：在特例情况下（例如1，1，1，1]），会退化到O（N）。
     * ·空间复杂度O（1）：i，j，m变量使用常数大小的额外空间。
     * @param numbers
     * @return
     */
    public static int minArray1(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) i = m + 1;
            else if (numbers[m] < numbers[j]) j = m;
            else j--;
        }
        return numbers[i];
    }

    public static void main(String[] args) {
        int[] arr = {-1, 3, 4, 5, 1, 2};
        System.out.println(minArray(arr));
    }
}
