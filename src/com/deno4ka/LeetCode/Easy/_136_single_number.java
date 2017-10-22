package com.deno4ka.LeetCode.Easy;

/*
Given an array of integers, every element appears twice except for one. Find that single one.
Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/

import java.util.HashMap;
import java.util.Set;

public class _136_single_number {

    public _136_single_number() {
//        System.out.println(singleNumber(null));
//        System.out.println(singleNumber(new int[] {}));
//        System.out.println(singleNumber(new int[] {9}));
//        System.out.println(singleNumber(new int[] {1, 0, 1}));
//        System.out.println(singleNumber(new int[] {0, 1, 0}));
        System.out.println(singleNumber(new int[] {0, 1, 0, 2, 1, 2, 3}));
    }

    private int singleNumber(int[] nums) {
        int result = 0;
        if (nums == null || nums.length == 0) {
            return result;
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            HashMap<Integer, Boolean> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.get(nums[i]) == null) {
                    map.put(nums[i], Boolean.TRUE);
                } else {
                    map.remove(nums[i]);
                }
            }
            Object[] keys = map.keySet().toArray();
            return (int)keys[0];
        }
    }

//    best from leet.code
//    public int singleNumber(int[] nums) {
//        int result = 0;
//        for (int i = 0; i < nums.length; i++)
//            result ^= nums[i];
//        return result;
//    }
}