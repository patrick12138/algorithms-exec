package com.patrick.offer;

/**
 *  输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
 *  比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 */
public class PrintNumbers {
    public static int[] printNumbers(int n) {
        int pow = (int) Math.pow(10, n);
        int[] arr = new int[pow - 1];
        for (int i = 0; i < pow - 1; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        for (int i : printNumbers(3)) {
            System.out.println(i);
        }
    }
}
