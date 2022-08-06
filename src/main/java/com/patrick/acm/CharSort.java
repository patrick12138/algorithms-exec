package com.patrick.acm;

import java.util.*;

public class CharSort {
    public static void main(String[] args) {
        String s1 = "asldkj";
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] split = scan.nextLine().split(" ");
        Arrays.sort(split);
        for (int i = 0; i < n; i++) {
            String s = split[i];
            System.out.print(s + " ");
        }
    }
}
