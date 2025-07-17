package com.deno4ka.LeetCode.algorithms.easy;

/*
You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2.
Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2.
If it does not exist, output -1 for this number.

Example 1:
Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
Output: [-1,3,-1]
Explanation:
    For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
    For number 1 in the first array, the next greater number for it in the second array is 3.
    For number 2 in the first array, there is no next greater number for it in the second array, so output -1.

Example 2:
Input: nums1 = [2,4], nums2 = [1,2,3,4].
Output: [3,-1]

Explanation:
    For number 2 in the first array, the next greater number for it in the second array is 3.
    For number 4 in the first array, there is no next greater number for it in the second array, so output -1.

Note:
All elements in nums1 and nums2 are unique.
The length of both nums1 and nums2 would not exceed 1000.
*/

public class _496_NextGreaterElement1 {

    // Runtime: 7 ms, faster than 11.47%
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int nextGreaterElement = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums1[i] < nums2[k]) {
                            nextGreaterElement = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
            result[i] = nextGreaterElement;
        }
        return result;
    }

    // from leet.code (2ms)
//	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//		Map<Integer, Integer> vMap = new HashMap<>();
//		for (int i = 0; i < nums2.length; i++) {
//			vMap.put(nums2[i], i);
//		}
//		int[] rslt = new int[nums1.length];
//		for (int i = 0; i < rslt.length; i++) {
//			int j = vMap.get(nums1[i]) + 1;
//			for (; j < nums2.length; j++) {
//				if (nums2[j] > nums1[i]) break;
//			}
//			rslt[i] = (j == nums2.length) ? -1 : nums2[j];
//		}
//		return rslt;
//	}

}
