package com.deno4ka.LeetCode.Easy;

/*
Say you have an array for which the i-th element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
 design an algorithm to find the maximum profit.
Example 1:
Input: [7, 1, 5, 3, 6, 4]
Output: 5
max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
Example 2:
Input: [7, 6, 4, 3, 1]
Output: 0
In this case, no transaction is done, i.e. max profit = 0.
*/

public class _121_best_time_to_buy_and_sell_stock {

    public _121_best_time_to_buy_and_sell_stock() {
        System.out.println(maxProfit(new int[] {0}));
//        System.out.println(maxProfit(new int[] {0, 1, 2}));
//        System.out.println(maxProfit(new int[] {7, 1, 5, 3, 6, 4}));    // 5
//        System.out.println(maxProfit(new int[] {7, 6, 4, 3, 1}));       // 0
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        if (prices == null) return profit;
        else {
            for (int i = 0; i < prices.length; i++) {
                int min = prices[i];
                int max = Integer.MIN_VALUE;
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[j] > max) {
                        max = prices[j];
                    }
                }
                if (i != prices.length - 1) {
                    int delta = max - min;
                    if (profit < delta) {
                        profit = delta;
                    }
                }
            }
           return profit;
        }
    }

}