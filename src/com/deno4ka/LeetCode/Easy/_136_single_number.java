package com.deno4ka.LeetCode.Easy;

/*
Given an array of integers, every element appears twice except for one. Find that single one.
Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/

public class _136_single_number {

    public _136_single_number() {
        System.out.println(singleNumber(null));
        System.out.println(singleNumber(new int[] {}));
        System.out.println(singleNumber(new int[] {9}));
        System.out.println(singleNumber(new int[] {0, 1}));
        System.out.println(singleNumber(new int[] {0, 1, 2}));
    }

    private int singleNumber(int[] nums) {
        int result = 0;
        if (nums == null || nums.length == 0) {
            return result;
        } else if (nums.length == 1) {
            return nums[0];
        } else {

            return result;
        }
    }
}