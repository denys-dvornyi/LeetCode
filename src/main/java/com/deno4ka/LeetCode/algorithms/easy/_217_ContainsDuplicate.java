package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an array of integers, find if the array contains any duplicates.
Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:
Input: [1,2,3,1]
Output: true

Example 2:
Input: [1,2,3,4]
Output: false

Example 3:
Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
*/

import java.util.HashSet;
import java.util.Set;

public class _217_ContainsDuplicate {

    public _217_ContainsDuplicate() {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1})); // true
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4})); // false
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})); // true
    }

    // (8ms/77.75%)
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        } else {
            Set<Integer> numbersSet = new HashSet<>();
            for (int number : nums) {
                if (!numbersSet.add(number)) {
                    return true;
                }
            }
            return false;
        }
    }

}