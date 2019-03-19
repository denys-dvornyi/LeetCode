package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a non-empty array of integers, return the third maximum number in this array.
If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]
Output: 1
Explanation: The third maximum is 1.

Example 2:
Input: [1, 2]
Output: 2
Explanation: The third maximum does not exist, so the maximum (2) is returned instead.

Example 3:
Input: [2, 2, 3, 1]
Output: 1
Explanation: Note that the third maximum here means the third maximum distinct number.

Both numbers with value 2 are both considered as second maximum.
*/

import java.util.Iterator;
import java.util.TreeSet;

public class _414_ThirdMaximumNumber {

	public _414_ThirdMaximumNumber() {
		System.out.println(thirdMax(new int[]{3, 2, 1})); //1
		System.out.println(thirdMax(new int[]{1, 2})); //2
		System.out.println(thirdMax(new int[]{2, 2, 3, 1})); //1
	}

	// (19ms/8.11%)
	public int thirdMax(int[] nums) {
		TreeSet<Integer> uniqueSortedNums = new TreeSet<>();
		for (int num : nums) {
			uniqueSortedNums.add(num);
		}
		if (uniqueSortedNums.size() < 3) {
			return uniqueSortedNums.last();
		} else {
			Iterator<Integer> iterator = uniqueSortedNums.descendingIterator();
			int counter = 0;
			while (iterator.hasNext()) {
				counter++;
				if (counter == 3) {
					return iterator.next();
				}
				iterator.next();
			}
			return -1;
		}
	}

}