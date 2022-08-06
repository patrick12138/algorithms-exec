package com.patrick.acm;

import org.junit.Test;

import java.util.*;

public class StringSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String[] arr = scan.nextLine().split(" ");
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void fuck() {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String[] arr = scan.nextLine().split(",");
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                if (i != arr.length - 1) System.out.print(arr[i] + ",");
                else System.out.print(arr[i]);
            }
            System.out.println();
        }
    }

}
