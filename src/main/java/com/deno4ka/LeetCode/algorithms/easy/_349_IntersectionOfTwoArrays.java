package com.deno4ka.LeetCode.algorithms.easy;

/*
Given two arrays, write a function to compute their intersection.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]

Note:
Each element in the result must be unique.
The result can be in any order.
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _349_IntersectionOfTwoArrays {

    public _349_IntersectionOfTwoArrays() {
        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}))); // [2]
        System.out.println(Arrays.toString(intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}))); // [9,4]
    }

    // (50ms/5.45%)
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[]{};
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }
        set1.retainAll(set2);
        return set1.stream().mapToInt(Integer::intValue).toArray();
    }

    // best from leetcode (3ms)
//	public int[] intersection(int[] nums1, int[] nums2) {
//		if (nums1.length > nums2.length) {
//			int[] temp = nums1;
//			nums1 = nums2;
//			nums2 = temp;
//		}
//
//		HashSet<Integer> nums2Set = new HashSet<>();
//		for (int num : nums2) {
//			nums2Set.add(num);
//		}
//
//		HashSet<Integer> resSet = new HashSet<>();
//		for (int num : nums1) {
//			if (nums2Set.contains(num)) {
//				resSet.add(num);
//			}
//		}
//		int[] res = new int[resSet.size()];
//		int count = 0;
//		for (int num : resSet) {
//			res[count++] = num;
//		}
//		return res;
//	}

}