package com.deno4ka.LeetCode.algorithms.easy;

/*
Winter is coming! Your first job during the contest is to design a standard heater with fixed warm radius to warm all the houses.

Now, you are given positions of houses and heaters on a horizontal line,
find out minimum radius of heaters so that all houses could be covered by those heaters.

So, your input will be the positions of houses and heaters seperately,
and your expected output will be the minimum radius standard of heaters.

Note:
Numbers of houses and heaters you are given are non-negative and will not exceed 25000.
Positions of houses and heaters you are given are non-negative and will not exceed 10^9.
As long as a house is in the heaters' warm radius range, it can be warmed.
All the heaters follow your radius standard and the warm radius will the same.

Example 1:
Input: [1,2,3],[2]
Output: 1
Explanation: The only heater was placed in the position 2, and if we use the radius 1 standard, then all the houses can be warmed.

Example 2:
Input: [1,2,3,4],[1,4]
Output: 1
Explanation: The two heater was placed in the position 1 and 4. We need to use radius 1 standard, then all the houses can be warmed.
*/

import java.util.Arrays;

public class _475_Heaters {

	// Runtime: 11 ms, faster than 90.50% | Memory Usage: 39.7 MB, less than 94.87%
	public int findRadius(int[] houses, int[] heaters) {
		Arrays.sort(houses);
		Arrays.sort(heaters);
		int prevHeaterCursor = 0;
		int heaterCursor = 0;
		int maxRadius = 0;
		int tmpRadius = 0;
		for (int i = 0; i < houses.length; i++) {
			if (heaterCursor == heaters.length) {
				if (heaters[heaterCursor - 1] < houses[i]) {
					int rightRadius = houses[houses.length - 1] - heaters[heaterCursor - 1];
					if (maxRadius < rightRadius) {
						maxRadius = rightRadius;
					}
				}
				break;
			} else if (houses[0] > heaters[heaterCursor]) {
				prevHeaterCursor = heaterCursor;
				maxRadius = houses[0] - heaters[heaterCursor++];
				i--;
				continue;
			} else if (houses[i] >= heaters[prevHeaterCursor] && houses[i] <= heaters[heaterCursor]) {
				int rightRadius = heaters[heaterCursor] - houses[i];
				if (heaterCursor > 0) {
					int leftRadius = houses[i] - heaters[prevHeaterCursor];
					int distanceBetweenHeaters = (heaters[heaterCursor] - heaters[prevHeaterCursor]) / 2;
					if (leftRadius <= distanceBetweenHeaters) {
						if (tmpRadius < leftRadius) {
							tmpRadius = leftRadius;
						}
					} else if (rightRadius < distanceBetweenHeaters) {
						if (tmpRadius < rightRadius) {
							tmpRadius = rightRadius;
						}
					} else {
						if (maxRadius < tmpRadius) {
							maxRadius = tmpRadius;
						}
						tmpRadius = 0;
						while (i < houses.length && houses[i] < heaters[heaterCursor]) {
							i++;
						}
						prevHeaterCursor = heaterCursor++;
						continue;
					}
				} else {
					if (maxRadius < rightRadius) {
						maxRadius = rightRadius;
					}
					if (heaterCursor < heaters.length) {
						while (i < houses.length && houses[i] < heaters[heaterCursor]) {
							i++;
						}
						prevHeaterCursor = heaterCursor++;
						if (heaterCursor == heaters.length) {
							if (heaters[prevHeaterCursor] < houses[houses.length - 1]) {
								rightRadius = houses[houses.length - 1] - heaters[prevHeaterCursor];
								if (maxRadius < rightRadius) {
									maxRadius = rightRadius;
								}
							}
							break;
						}
						continue;
					} else {
						break;
					}
				}
			} else if (houses[i] >= heaters[prevHeaterCursor] && houses[i] > heaters[heaterCursor]) {
				if (prevHeaterCursor < heaters.length - 1 && houses[i] > heaters[prevHeaterCursor + 1]) {
					prevHeaterCursor++;
				}
				i--;
				heaterCursor++;
				continue;
			} else if (houses[0] < heaters[0]) {
				maxRadius = heaters[0] - houses[0];
			} else {
				prevHeaterCursor = heaterCursor++;
			}
		}
		if (maxRadius < tmpRadius) {
			maxRadius = tmpRadius;
		}
		return maxRadius;
	}

	// very short solution from leetcode.com
//	public int findRadius(int[] houses, int[] heaters) {
//		if (houses == null || heaters == null)
//			return 0;
//		int result = 0;
//		Arrays.sort(heaters);
//		Arrays.sort(houses);
//
//		int i = 0;
//		int j = 0;
//		while (i < houses.length) {
//			while (j < heaters.length - 1 && Math.abs(heaters[j + 1] - houses[i]) <= Math.abs(heaters[j] - houses[i])) {
//				j++;
//			}
//			int radius = Math.abs(heaters[j] - houses[i]);
//			result = Math.max(result, radius);
//			i++;
//		}
//
//		return result;
//	}

}