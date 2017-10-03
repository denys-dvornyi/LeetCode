package com.deno4ka.LeetCode.Easy;

/*
Say you have an array for which the ith element is the price of a given stock on day i.
Design an algorithm to find the maximum profit.
You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times).
However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
*/

public class _122_best_time_to_buy_and_sell_stock_2 {

    public _122_best_time_to_buy_and_sell_stock_2() {
//        System.out.println(maxProfit(null));
//        System.out.println(maxProfit(new int[] {0}));
//        System.out.println(maxProfit(new int[] {1, 2}));                // 1
        System.out.println(maxProfit(new int[] {2,4,1}));                // 2
//        System.out.println(maxProfit(new int[] {7, 1, 5, 3, 6, 4}));    // 7
    }

    private int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices == null || prices.length == 0) {
            return maxProfit;
        } else {
            int min = prices[0];
            int max = Integer.MIN_VALUE;
            for (int i = 1; i < prices.length; i++) {
                if (min >= prices[i]) {
                    if (max > Integer.MIN_VALUE) {
                        maxProfit += max - min;
                        max = Integer.MIN_VALUE;
                    }
                    min = prices[i];
                } else {
                    if (max < prices[i]) {
                        max = prices[i];
                    } else {
                        maxProfit += max - min;
                        min = prices[i];
                        max = Integer.MIN_VALUE;
                    }
                }
            }
            if (max > Integer.MIN_VALUE) {
                maxProfit += max - min;
            }
            return maxProfit;
        }
    }

}