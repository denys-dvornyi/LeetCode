package com.deno4ka.LeetCode.algorithms.easy;

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

public class _121_BestTimeToBuyAndSellStock {

    public _121_BestTimeToBuyAndSellStock() {
//        System.out.println(maxProfit(new int[] {0}));
//        System.out.println(maxProfit(new int[] {1, 2}));                // 1
        System.out.println(maxProfit(new int[] {7, 1, 5, 3, 6, 4}));    // 5
//        System.out.println(maxProfit(new int[] {7, 6, 4, 3, 1}));       // 0
    }


    public int maxProfit(int[] prices) {
        int profit = 0;
        if (prices == null) return profit;
        else {
            int max = Integer.MIN_VALUE;
            for (int i = prices.length - 1; i >= 0; i--) {
                if (i == prices.length - 1) {
                    if (max < prices[i]) {
                        max = prices[i];
                    }
                } else {
                    int min = prices[i];
                    int delta = max - min;
                    if (profit < delta) {
                        profit = delta;
                    }
                    if (max < prices[i]) {
                        max = prices[i];
                    }
                }
            }
           return profit;
        }
    }

    // Time Limit Exceeded
//    public int maxProfit(int[] prices) {
//        int profit = 0;
//        if (prices == null) return profit;
//        else {
//            for (int i = 0; i < prices.length; i++) {
//                int min = prices[i];
//                int max = Integer.MIN_VALUE;
//                for (int j = i + 1; j < prices.length; j++) {
//                    if (prices[j] > max) {
//                        max = prices[j];
//                    }
//                }
//                if (i != prices.length - 1) {
//                    int delta = max - min;
//                    if (profit < delta) {
//                        profit = delta;
//                    }
//                }
//            }
//           return profit;
//        }
//    }

}