package com.deno4ka.LeetCode.algorithms.easy;

/*
Suppose you have a long flowerbed in which some of the plots are planted and some are not.
However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.
Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty),
and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: True

Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: False

Note:
The input array won't violate no-adjacent-flowers rule.
The input array size is in the range of [1, 20000].
n is a non-negative integer which won't exceed the input array size.
*/

public class _605_CanPlaceFlowers {

	// Runtime: 1 ms, faster than 94.72% & Memory Usage: 41.1 MB, less than 13.89%
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		if (n == 0) return true;
		if (n > (flowerbed.length + 1) / 2) return false;
		boolean leftFlower = false, rightFlower = false;
		int emptyPlaces = 0;
		int emptyPlacesGroups = 0;
		int noAdjacentFlowerPlaces = 0;
		for (int i = 0; i < flowerbed.length; i++) {
			boolean isFlower = flowerbed[i] == 1;
			if (i == 0) {
				leftFlower = isFlower;
			}
			if (i == flowerbed.length - 1) {
				rightFlower = isFlower;
			}
			if (isFlower) {
				if (emptyPlaces > 0) {
					emptyPlacesGroups++;
				}
				if (emptyPlaces > 1) {
					if (!leftFlower) {
						noAdjacentFlowerPlaces += (emptyPlaces) / 2;
					} else {
						noAdjacentFlowerPlaces += (emptyPlaces - 1) / 2;
					}
				}
				leftFlower = true;
				emptyPlaces = 0;
			} else {
				emptyPlaces++;
			}
		}
		if (emptyPlaces > 0) {
			if (!leftFlower && !rightFlower && emptyPlacesGroups == 0) {
				noAdjacentFlowerPlaces += (emptyPlaces + 1) / 2;
			} else if (!rightFlower) {
				noAdjacentFlowerPlaces += emptyPlaces / 2;
			}
		}
		return n <= noAdjacentFlowerPlaces;
	}

}
