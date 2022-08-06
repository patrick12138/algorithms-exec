package com.patrick.sort;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { //升序
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 冒泡flag效率优化
     *
     * @param nums
     */
    public static void bubbleSort1(int[] nums) {
        int N = nums.length;
        for (int i = 0; i < N - 1; i++) {
            boolean flag = false; // 初始化标志位
            for (int j = 0; j < N - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    flag = true;  // 记录交换元素
                }
            }
            if (!flag) break;     // 内循环未交换任何元素，则跳出
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 0, 7, 6, 2};
        bubbleSort1(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
