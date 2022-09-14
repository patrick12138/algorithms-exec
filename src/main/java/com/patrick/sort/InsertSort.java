package com.patrick.sort;

/**
 * 插入排序，稳定，n²
 */
public class InsertSort {
    public static int[] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int preIndex = i - 1;
            int current = arr[i];
            while (preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
        return arr;
    }

    /**
     * 折半排序
     * @param array
     * @return
     */
    public static int[] binarySort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i]; //选择插入的数字
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > temp) {
                    array[j + 1] = array[j];
                    array[j] = temp;
                } else {
                    break;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 0, 7, 6, 2};
//        for (int i : insertSort(arr)) {
//            System.out.print(i + ",");
//        }
        System.out.println();
    }


}