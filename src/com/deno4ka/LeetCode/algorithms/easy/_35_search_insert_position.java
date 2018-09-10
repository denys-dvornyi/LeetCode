package com.deno4ka.LeetCode.algorithms.easy;

// Given a sorted array and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
// You may assume no duplicates in the array.
// Here are few examples.
// [1,3,5,6], 5 → 2
// [1,3,5,6], 2 → 1
// [1,3,5,6], 7 → 4
// [1,3,5,6], 0 → 0

public class _35_search_insert_position {

    public _35_search_insert_position() {
//        System.out.println(searchInsert(new int[]{1,3,5,6}, 5));    // → 2
//        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));    // → 1
//        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));    // → 4
//        System.out.println(searchInsert(new int[]{1,3,5,6}, 0));    // → 0
        System.out.println(searchInsert(null, 0));    // → 0
    }

    private int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (target <= nums[i]) {
                    return i;
                }
            }
            return nums.length;
        }
    }

}