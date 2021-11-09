package com.deno4ka.LeetCode.algorithms.easy;

/*
Let's call an array arr a mountain if the following properties hold:
arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... arr[i-1] < arr[i]
arr[i] > arr[i+1] > ... > arr[arr.length - 1]
Given an integer array arr that is guaranteed to be a mountain,
return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1

Example 3:
Input: arr = [0,10,5,2]
Output: 1

Example 4:
Input: arr = [3,4,5,1]
Output: 2

Example 5:
Input: arr = [24,69,100,99,79,78,67,36,26,19]
Output: 2

Constraints:
3 <= arr.length <= 104
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.

Follow up: Finding the O(n) is straightforward, could you find an O(log(n)) solution?
*/

public class _852_PeakIndexInAMountainArray {

//	O(n) solution. Runtime: 0 ms, faster than 100.00% & Memory Usage: 39.4 MB, less than 53.89%
//	public int peakIndexInMountainArray(int[] arr) {
//		int value = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if (value < arr[i]) {
//				value = arr[i];
//			} else {
//				return i - 1;
//			}
//		}
//		return 0;
//	}

//	O(log(n)) solution. (some kind of binary search)
//  Runtime: 0 ms, faster than 100.00% & Memory Usage: 39.4 MB, less than 46.73%
	public int peakIndexInMountainArray(int[] arr) {
		if (arr.length == 3) return 1;
		int left = 0;
		int right = arr.length;
		int mid = (left + right) / 2;
		for ( ; ; ) {
			if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
				return mid;
			} else if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
				left = mid;
				mid = (left + right) / 2;
			} else if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]) {
				right = mid;
				mid = (left + right) / 2;
			}
		}
	}

}
