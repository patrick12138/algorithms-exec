package com.patrick.sort;

public class BubbleSort {
    public static int [] bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { //升序
                    temp =arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,4,0,7,6,2};
        for (int i : bubbleSort(arr)) {
            System.out.print(i+",");
        }
    }
}
