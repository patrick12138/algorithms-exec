package com.patrick.offer;

import java.util.Arrays;

public class GetLeastNumbers {
    /**
     * 堆排
     *
     * @param arr
     * @param k
     * @return
     */
    public static int[] getLeastNumbers(int[] arr, int k) {
        return new int[0];
    }

    /**
     * 整活，图一乐
     *
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers1(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOf(arr, k);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 3, 4, 9, 0};
        for (int leastNumber : getLeastNumbers(arr1, 3)) {
            System.out.println(leastNumber);
        }
    }
}
