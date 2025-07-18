package com.deno4ka.LeetCode.algorithms.easy;

/*
Alice and Bob have a different total number of candies.
You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the ith box of candy that Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has.
Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the same total amount of candy.
The total amount of candy a person has is the sum of the number of candies in each box they have.
Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange, and answer[1] is the number of candies in the box that Bob must exchange.
If there are multiple answers, you may return any one of them.
It is guaranteed that at least one answer exists.

Example 1:
Input: aliceSizes = [1,1], bobSizes = [2,2]
Output: [1,2]

Example 2:
Input: aliceSizes = [1,2], bobSizes = [2,3]
Output: [1,2]

Example 3:
Input: aliceSizes = [2], bobSizes = [1,3]
Output: [2,3]

Example 4:
Input: aliceSizes = [1,2,5], bobSizes = [2,4]
Output: [5,4]

Constraints:
1 <= aliceSizes.length, bobSizes.length <= 104
1 <= aliceSizes[i], bobSizes[j] <= 105
Alice and Bob have a different total number of candies.
There will be at least one valid answer for the given input.
*/

import java.util.Arrays;

public class _888_FairCandySwap {

    //	Runtime: 11 ms, faster than 70.92% & Memory Usage: 40.6 MB, less than 67.84%
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] result = new int[2];
        long totalAliceCandies = 0;
        long totalBobCandies = 0;
        for (int candy : aliceSizes) {
            totalAliceCandies += candy;
        }
        for (int candy : bobSizes) {
            totalBobCandies += candy;
        }
        int diff = (int) (totalAliceCandies - totalBobCandies);
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        if (diff > 0) {
            diff /= 2;
            for (int i = 0, j = 0; i < aliceSizes.length && j < bobSizes.length; ) {
                if (aliceSizes[i] < bobSizes[j]) {
                    i++;
                } else {
                    if (aliceSizes[i] - bobSizes[j] == diff) {
                        result[0] = aliceSizes[i];
                        result[1] = bobSizes[j];
                        return result;
                    } else if (aliceSizes[i] - bobSizes[j] < diff) {
                        i++;
                    } else {
                        j++;
                    }
                }
            }
        } else {
            diff /= -2;
            for (int i = 0, j = 0; i < aliceSizes.length && j < bobSizes.length; ) {
                if (bobSizes[j] < aliceSizes[i]) {
                    j++;
                } else {
                    if (bobSizes[j] - aliceSizes[i] == diff) {
                        result[0] = aliceSizes[i];
                        result[1] = bobSizes[j];
                        return result;
                    } else if (bobSizes[j] - aliceSizes[i] < diff) {
                        j++;
                    } else {
                        i++;
                    }
                }
            }
        }
        return result;
    }

}
