package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
Sort the array so that whenever nums[i] is odd, `i` is odd, and whenever nums[i] is even, `i` is even.
Return any answer array that satisfies this condition.

Example 1:
Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

Example 2:
Input: nums = [2,3]
Output: [2,3]

Constraints:
2 <= nums.length <= 2 * 10in4th
nums.length is even.
Half of the integers in nums are even.
0 <= nums[i] <= 1000

Follow Up: Could you solve it in-place?
*/

public class _922_SortArrayByParity2 {

    //	sort in a new array
//	Runtime: 2 ms, faster than 98.04% & Memory Usage: 42 MB, less than 21.45%
    public int[] sortArrayByParityII(int[] nums) {
        int[] result = new int[nums.length];
        int evenPosition = 0;
        int oddPosition = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenPosition] = num;
                evenPosition += 2;
            } else {
                result[oddPosition] = num;
                oddPosition -= 2;
            }
        }
        return result;
    }

//	sort in-place
//	Runtime: 3 ms, faster than 39.33% & Memory Usage: 40.2 MB, less than 49.62%
//	public int[] sortArrayByParityII(int[] nums) {
//		int evenPosition = 0;
//		int oddPosition = nums.length - 1;
//		while (evenPosition < nums.length && oddPosition > 0) {
//			if (nums[evenPosition] % 2 == 0) {
//				evenPosition += 2;
//			} else if (nums[oddPosition] % 2 == 1) {
//				oddPosition -= 2;
//			} else {
//				if (nums[evenPosition] % 2 != 0) {
//					while (oddPosition > 0) {
//						if (nums[oddPosition] % 2 == 1) {
//							oddPosition -= 2;
//						} else {
//							int tmp = nums[evenPosition];
//							nums[evenPosition] = nums[oddPosition];
//							nums[oddPosition] = tmp;
//							evenPosition += 2;
//							oddPosition -= 2;
//							break;
//						}
//					}
//				} else if (nums[oddPosition] % 2 != 1) {
//					while (evenPosition < nums.length) {
//						if (nums[evenPosition] % 2 == 0) {
//							evenPosition += 2;
//						} else {
//							int tmp = nums[oddPosition];
//							nums[oddPosition] = nums[evenPosition];
//							nums[evenPosition] = tmp;
//							evenPosition += 2;
//							oddPosition -= 2;
//							break;
//						}
//					}
//				}
//			}
//		}
//		return nums;
//	}

}
