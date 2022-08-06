package com.patrick.acm;

import org.junit.Test;

import java.util.Scanner;

public class IntegerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext()) {
            String[] split = scanner.nextLine().split(" ");
            Long a = Long.parseLong(split[0]);
            Long b = Long.parseLong(split[1]);
            System.out.println(a + b);
        }
    }

    /**
     * 计算 a+b
     */
    @Test
    public void sum() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            String[] buffer = str.split(" ");

            int a = Integer.parseInt(buffer[0]);
            int b = Integer.parseInt(buffer[1]);

            System.out.println(a + b);
        }
    }

    /**
     * 输入第一行包括一个数据组数t(1 <= t <= 100)
     * 接下来每行包括两个正整数a,b(1 <= a, b <= 1000)
     */
    @Test
    public void sum2() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (scanner.hasNext()) {
            String[] split = scanner.nextLine().split(" ");
            int sum = 0;
            for (int i = 0; i < 2; i++) {
                sum += Integer.parseInt(split[i]);
            }
            System.out.println(sum);
        }
    }

    /**
     * 输入数据包括多组。
     * 每组数据一行,每行的第一个整数为整数的个数n(1 <= n <= 100), n为0的时候结束输入。
     * 接下来n个正整数,即需要求和的每个正整数。
     * <p>
     * 4 1 2 3 4
     * 5 1 2 3 4 5
     * 0
     */
    @Test
    public void sum4() {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        while (n != 0) {
            String[] split = scanner.nextLine().split(" ");
            n = Integer.parseInt(split[0]);
            int sum = 0;
            for (int i = 1; i < split.length; i++) {
                sum += Integer.parseInt(split[i]);
            }
            if (sum == 0) break;
            System.out.println(sum);
        }
    }

    /**
     * 输入的第一行包括一个正整数t(1 <= t <= 100), 表示数据组数。
     * 接下来t行, 每行一组数据。
     * 每行的第一个整数为整数的个数n(1 <= n <= 100)。
     * 接下来n个正整数, 即需要求和的每个正整数。
     */
    @Test
    public void sum5() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String[] split = scanner.nextLine().split(" ");
            int sum = 0;
            for (int j = 1; j < split.length; j++) {
                sum += Integer.parseInt(split[j]);
            }
            System.out.println(sum);
        }
    }

    /**
     *
     */
    @Test
    public void sum6() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] split = scanner.nextLine().split(" ");
            int sum = 0;
            for (int i = 1; i < split.length; i++) {
                sum += Integer.parseInt(split[i]);
            }
            System.out.println(sum);
        }
    }

    @Test
    public void sum7() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] split = scanner.nextLine().split(" ");
            int sum = 0;
            for (int i = 0; i < split.length; i++) {
                sum += Integer.parseInt(split[i]);
            }
            System.out.println(sum);
        }
    }

}
