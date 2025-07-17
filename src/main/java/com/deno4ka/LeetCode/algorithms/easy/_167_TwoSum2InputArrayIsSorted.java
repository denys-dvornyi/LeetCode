package com.deno4ka.LeetCode.algorithms.easy;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * Note:
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Example:
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */

public class _167_TwoSum2InputArrayIsSorted {

    public _167_TwoSum2InputArrayIsSorted() {
//		int[] result = twoSum(new int[] {2,3,4}, 6);
//		int[] result = twoSum(new int[] {2,7,11,15}, 9);
//		int[] result = twoSum(new int[] {5,25,75}, 100);
//		System.out.println(result);
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if (numbers.length == 2) {
            result[0] = 1;
            result[1] = 2;
        } else {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > target) {
                    continue;
                } else {
                    for (int j = i + 1; j < numbers.length; j++) {
                        if (numbers[i] + numbers[j] == target) {
                            result[0] = i + 1;
                            result[1] = j + 1;
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }

    // best from leet.code
//	public int[] twoSum(int[] numbers, int target) {
//		int x= 0,y=numbers.length-1;
//		while(x<y) {
//			//int mid=x+(y-x)/2;
//			if(numbers[x]+numbers[y]==target)return new int[]{x+1,y+1};
//			if(numbers[x]+numbers[y]>target)
//				y--;
//			else
//				x++;
//		}
//		return numbers[x]+numbers[y]==target?new int[]{x+1,y+1}:new int[]{-1,-1};
//	}

}