package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an array points where points[i] = [xi, yi] represents a point on the X-Y plane, return true if these points are a boomerang.
A boomerang is a set of three points that are all distinct and not in a straight line.

Example 1:
Input: points = [[1,1],[2,3],[3,2]]
Output: true

Example 2:
Input: points = [[1,1],[2,2],[3,3]]
Output: false

Constraints:
points.length == 3
points[i].length == 2
0 <= xi, yi <= 100
*/

public class _1037_ValidBoomerang {

//	Runtime: 1 ms, faster than 37.75% & Memory Usage: 38.4 MB, less than 40.56%
	public boolean isBoomerang(int[][] points) {
		return ((points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) - (points[1][1] - points[0][1]) * (points[2][0] - points[0][0])) != 0;
	}

//	public boolean isBoomerang(int[][] points) {
//		int diffX2And1 = points[1][0] - points[0][0];
//		int diffY2And1 = points[1][1] - points[0][1];
//		int diffX3And1 = points[2][0] - points[0][0];
//		int diffY3And1 = points[2][1] - points[0][1];
//		return (diffX2And1 * diffY3And1 - diffY2And1 * diffX3And1) != 0;
//	}

//	from leet.code
//	public boolean isBoomerang(int[][] points) {
//		int area = points[0][0]*(points[1][1]-points[2][1])
//				+ points[1][0]*(points[2][1]-points[0][1])
//				+ points[2][0]*(points[0][1]-points[1][1]);
//
//		return (area!=0);
//	}

}
