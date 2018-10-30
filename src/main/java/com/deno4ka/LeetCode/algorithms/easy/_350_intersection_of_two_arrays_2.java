package com.deno4ka.LeetCode.algorithms.easy;

/*
Given two arrays, write a function to compute their intersection.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.

Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _350_intersection_of_two_arrays_2 {

	public _350_intersection_of_two_arrays_2() {
		System.out.println(Arrays.toString(intersect(new int[]{1,2,2,1}, new int[]{2,2}))); // [2,2]
		System.out.println(Arrays.toString(intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4}))); // [4,9]
	}

	// (69ms/2.64%)
	public int[] intersect(int[] nums1, int[] nums2) {
		if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
			return new int[]{};
		}
		if (nums2.length > nums1.length) {
			int[] tmp = nums2;
			nums2 = nums1;
			nums1 = tmp;
		}
		List<Integer> firstArray = new ArrayList<>(nums1.length);
		for (int num : nums1) {
			firstArray.add(num);
		}
		List<Integer> intersections = new ArrayList<>();
		for (int num : nums2) {
			if (firstArray.contains(num)) {
				intersections.add(num);
				firstArray.remove(new Integer(num));
			}
		}
		return intersections.stream().mapToInt(Integer::intValue).toArray();
	}

	// best from leetcode
//	public int[] intersect(int[] nums1, int[] nums2) {
//		Arrays.sort(nums1);
//		Arrays.sort(nums2);
//		int maxIntersectionSize = (nums1.length > nums2.length) ? nums1.length : nums2.length;
//		int[] intersections = new int[maxIntersectionSize];
//		int i = 0, j = 0, intersectionsCounter = 0;
//		while (i != nums1.length && j != nums2.length) {
//			if (nums1[i] == nums2[j]) {
//				intersections[intersectionsCounter] = nums1[i];
//				i++;
//				j++;
//				intersectionsCounter++;
//			} else if (nums1[i] > nums2[j]) {
//				j++;
//			} else {
//				i++;
//			}
//		}
//		return Arrays.copyOf(intersections, intersectionsCounter);
//	}

}