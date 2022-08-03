package com.patrick.offer;

/**
 * https://leetcode.cn/problems/gu-piao-de-zui-da-li-run-lcof/
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 */
public class MaxProfit {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int res = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= min) {
                min = prices[i];
            } else {
                res = Math.max(res, prices[i] - min);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }
}
