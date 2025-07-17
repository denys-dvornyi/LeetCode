package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*/

public class _219_ContainsDuplicate2 {

    public _219_ContainsDuplicate2() {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, -1)); // false
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 0)); // false
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 4)); // true
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3)); // true
        System.out.println(containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1)); // true
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)); // false
        System.out.println(containsNearbyDuplicate(new int[]{99, 99}, 2)); // true
        System.out.println(containsNearbyDuplicate(new int[]{2, 2}, 3)); // true
    }

    // my solution (557ms/5.77%)
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1) {
            return false;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j] && (j - i) <= k) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    // from leet.code (18ms)
//	public boolean containsNearbyDuplicate(int[] nums, int k) {
//		HashMap<Integer,Integer> result = new HashMap<>();
//		for (int i = 0; i < nums.length; i++) {
//			if (result.containsKey(nums[i]) && ((i - result.get(nums[i])) <= k)) {
//				return true;
//			} else {
//				result.put(nums[i],i);
//			}
//		}
//		return false;
//	}

}