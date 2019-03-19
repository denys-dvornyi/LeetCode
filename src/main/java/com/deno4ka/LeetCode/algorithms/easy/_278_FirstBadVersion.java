package com.deno4ka.LeetCode.algorithms.easy;

/*
You are a product manager and currently leading a team to develop a new product. Unfortunately,
the latest version of your product fails the quality check. Since each version is developed based on the previous version,
all the versions after a bad version are also bad.
Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
You are given an API bool isBadVersion(version) which will return whether version is bad.
Implement a function to find the first bad version. You should minimize the number of calls to the API.

Example:
Given n = 5, and version = 4 is the first bad version.

call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true

Then 4 is the first bad version.

The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version);
*/

public class _278_FirstBadVersion extends VersionControl {

	public static int IS_BAD;

	public _278_FirstBadVersion() {
		IS_BAD = 4;
		System.out.println(firstBadVersion(5)); // 4
		IS_BAD = 2;
		System.out.println(firstBadVersion(3)); // 2
		System.out.println(firstBadVersion(2)); // 2
	}

	// (14ms/32.39%)
	public int firstBadVersion(int n) {
		int low = 1;
		int high = n;
		int midl = low + (high - low) / 2;
		boolean isBadVersion;
		while (low <= high) { // binary search
			isBadVersion = super.isBadVersion(midl);
			if (isBadVersion) {
				high = midl - 1;
				midl = low + (high - low) / 2;
			} else {
				low = midl + 1;
				midl = low + (high - low) / 2;
			}
		}
		return midl;
	}

}

class VersionControl {
	public boolean isBadVersion(int version) {
		return version >= _278_FirstBadVersion.IS_BAD;
	}
}