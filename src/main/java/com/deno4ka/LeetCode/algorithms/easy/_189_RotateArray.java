package com.deno4ka.LeetCode.algorithms.easy;

/**
 Given an array, rotate the array to the right by k steps, where k is non-negative.

 Example 1:
 Input: [1,2,3,4,5,6,7] and k = 3
 Output: [5,6,7,1,2,3,4]
 Explanation:
 rotate 1 steps to the right: [7,1,2,3,4,5,6]
 rotate 2 steps to the right: [6,7,1,2,3,4,5]
 rotate 3 steps to the right: [5,6,7,1,2,3,4]

 Example 2:
 Input: [-1,-100,3,99] and k = 2
 Output: [3,99,-1,-100]
 Explanation:
 rotate 1 steps to the right: [99,-1,-100,3]
 rotate 2 steps to the right: [3,99,-1,-100]

 Note:
 Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 Could you do it in-place with O(1) extra space?
 */

public class _189_RotateArray {

	public _189_RotateArray() {
		rotate(new int[] {1,2,3,4,5,6,7}, 3); // [5,6,7,1,2,3,4]
		rotate(new int[] {-1,-100,3,99}, 2);  // [3,99,-1,-100]
		rotate(new int[] {-1}, 2);  // [3,99,-1,-100]
		rotate(new int[] {1,2}, 3);  // [3,99,-1,-100]
	}

	// v 2.0 0ms (!!!not in-place!!!)
	public void rotate(int[] nums, int k) {
		if (k > 0 && nums.length > 1) {
			if (k > nums.length) {
				k = k % nums.length;
			}
			int[] result = new int[nums.length];
			System.arraycopy(nums, nums.length - k, result, 0, k);
			System.arraycopy(nums, 0, result, k, nums.length - k);
			System.arraycopy(result, 0, nums, 0, result.length);
		}
		printArray(nums);
	}

	// v 1.0 "Time Limit Exceeded"
//	public void rotate(int[] nums, int k) {
//		while (k > 0) {
//			int tmp = nums[nums.length - 1];
//			for (int i = nums.length - 1; i >= 0; i--) {
//				if (i == 0) nums[i] = tmp;
//				else {
//					nums[i] = nums[i - 1];
//				}
//			}
//			k--;
//		}
//	}

	private void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
	}

}