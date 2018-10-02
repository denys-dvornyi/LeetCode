package com.deno4ka.LeetCode.algorithms.easy;

/*
Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
Please note that the string does not contain any non-printable characters.

Example:
Input: "Hello, my name is John"
Output: 5
*/

public class _434_number_of_segments_in_a_string {

	public _434_number_of_segments_in_a_string() {
		System.out.println(countSegments(null));
		System.out.println(countSegments(""));
		System.out.println(countSegments("   "));
	}

	public int countSegments(String s) {
		if (s == null || s.isEmpty()) {
			return 0;
		} else {

			return s.length();
		}
	}

}