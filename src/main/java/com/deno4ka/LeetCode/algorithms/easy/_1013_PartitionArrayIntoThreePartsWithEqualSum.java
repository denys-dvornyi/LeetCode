package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an array of integers arr, return true if we can partition the array into three non-empty parts with equal sums.
Formally, we can partition the array if we can find indexes
i + 1 < j with (arr[0] + arr[1] + ... + arr[i] == arr[i + 1] + arr[i + 2] + ... + arr[j - 1] == arr[j] + arr[j + 1] + ... + arr[arr.length - 1])

Example 1:
Input: arr = [0,2,1,-6,6,-7,9,1,2,0,1]
Output: true
Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1

Example 2:
Input: arr = [0,2,1,-6,6,7,9,-1,2,0,1]
Output: false

Example 3:
Input: arr = [3,3,6,5,-2,2,5,1,-9,4]
Output: true
Explanation: 3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4

Constraints:
3 <= arr.length <= 5 * 10(4)
-10(4) <= arr[i] <= 10(4)
*/

public class _1013_PartitionArrayIntoThreePartsWithEqualSum {

//	Time Limit Exceeded - 72/72 test cases passed, but took too long ;(
//	public boolean canThreePartsEqualSum(int[] arr) {
//		if (arr.length == 3 && (arr[0] != arr[1] && arr[1] != arr[2])) return false;
//		long sum = 0;
//		for (int j : arr) {
//			sum += j;
//		}
//		if (sum % 3 != 0) return false;
//		for (int i = 0; i < arr.length - 2; i++) {
//			int firstSum = 0;
//			int firstStartIndex = 0;
//			for ( ; firstStartIndex <= i; firstStartIndex++) {
//				firstSum += arr[firstStartIndex];
//			}
//			int secondSum = 0;
//			int secondStartIndex = firstStartIndex;
//			boolean foundTwoEqualSums = false;
//			for (; secondStartIndex < arr.length - 1; secondStartIndex++) {
//				secondSum += arr[secondStartIndex];
//				if (firstSum == secondSum) {
//					foundTwoEqualSums = true;
//					int thirdSum = 0;
//					int thirdStartIndex = secondStartIndex + 1;
//					for (; thirdStartIndex < arr.length; thirdStartIndex++) {
//						thirdSum += arr[thirdStartIndex];
//					}
//					if (secondSum == thirdSum) return true;
//				}
//			}
//			if (!foundTwoEqualSums) continue;
//			int thirdSum = 0;
//			int thirdStartIndex = secondStartIndex;
//			for (; thirdStartIndex < arr.length; thirdStartIndex++) {
//				thirdSum += arr[thirdStartIndex];
//			}
//			if (secondSum == thirdSum) return true;
//		}
//		return false;
//	}

//	v 2.0
//	Runtime: 2394 ms, faster than 5.04% & Memory Usage: 46.5 MB, less than 72.68%
//	public boolean canThreePartsEqualSum(int[] arr) {
//		if (arr.length == 3 && (arr[0] != arr[1] && arr[1] != arr[2])) return false;
//		long sum = 0;
//		for (int j : arr) sum += j;
//		if (sum % 3 != 0) return false;
//		int firstSum = 0;
//		for (int i = 0; i < arr.length - 2; i++) {
//			firstSum += arr[i];
//			int secondSum = 0;
//			int secondStartIndex = i + 1;
//			boolean foundTwoEqualSums = false;
//			for (; secondStartIndex < arr.length - 1; secondStartIndex++) {
//				secondSum += arr[secondStartIndex];
//				if (firstSum == secondSum) {
//					foundTwoEqualSums = true;
//					int thirdSum = 0;
//					int thirdStartIndex = secondStartIndex + 1;
//					for (; thirdStartIndex < arr.length; thirdStartIndex++) {
//						thirdSum += arr[thirdStartIndex];
//					}
//					if (secondSum == thirdSum) return true;
//				}
//			}
//			if (!foundTwoEqualSums) continue;
//			int thirdSum = 0;
//			int thirdStartIndex = secondStartIndex;
//			for (; thirdStartIndex < arr.length; thirdStartIndex++) {
//				thirdSum += arr[thirdStartIndex];
//			}
//			if (secondSum == thirdSum) return true;
//		}
//		return false;
//	}

//	best from leet.code 1 ms
public boolean canThreePartsEqualSum(int[] arr) {
	if (arr.length < 3) return false;
	int sum = 0;
	for (int j : arr) sum = sum + j;
	if (sum % 3 != 0) return false;

	int left = 0;
	int right = arr.length - 1;
	int leftsum = arr[0];
	int rightsum = arr[arr.length - 1];

	while (left < right) {

		if (leftsum != sum / 3) {
			left++;
			leftsum = leftsum + arr[left];
		}

		if (rightsum != sum / 3) {
			right--;
			rightsum = rightsum + arr[right];
		}

		if (leftsum == sum / 3 && rightsum == sum / 3) {
			return (right - left) > 1;
		}

	}
	return false;
}

}
