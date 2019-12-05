package com.deno4ka.LeetCode.algorithms.easy;

/*
You are given a string representing an attendance record for a student. The record only contains the following three characters:
'A' : Absent.
'L' : Late.
'P' : Present.

A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
You need to return whether the student could be rewarded according to his attendance record.

Example 1:
Input: "PPALLP"
Output: True

Example 2:
Input: "PPALLL"
Output: False
*/

public class _551_StudentAttendanceRecord1 {

	// Runtime: 0 ms, faster than 100.00% & Memory Usage: 34.3 MB, less than 100.00%
	public boolean checkRecord(String s) {
		if (s.length() < 2) return true;
		int A = 0, L = 0;
		char[] record = s.toCharArray();
		for (int i = 0; i < record.length; i++) {
			if (A > 1 || L > 2) return false;
			switch (record[i]) {
				case 'A': L = 0; A++; break;
				case 'P': L = 0; break;
				case 'L': L++; break;
			}
		}
		return A <= 1 && L <= 2;
	}

}
