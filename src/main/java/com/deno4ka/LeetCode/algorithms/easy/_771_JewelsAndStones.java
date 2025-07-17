package com.deno4ka.LeetCode.algorithms.easy;

/*
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
Each character in stones is a type of stone you have.
You want to know how many of the stones you have are also jewels.
Letters are case-sensitive, so "a" is considered a different type of stone from "A".

Example 1:
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

Example 2:
Input: jewels = "z", stones = "ZZ"
Output: 0

Constraints:
1 <= jewels.length, stones.length <= 50
jewels and stones consist of only English letters.
All the characters of jewels are unique.
*/

public class _771_JewelsAndStones {

    //	Runtime: 0 ms, faster than 100.00% & Memory Usage: 37.4 MB, less than 78.28%
//	array solution, faster than String.contains()
    public int numJewelsInStones(String jewels, String stones) {
        int jewelsNum = 0;
        boolean[] jewelsArray = new boolean[123];   // because 'z' char equals 122, so we need 123 elements array
        for (char j : jewels.toCharArray()) {
            jewelsArray[j] = true;
        }
        for (char c : stones.toCharArray()) {
            if (jewelsArray[c]) {
                jewelsNum++;
            }
        }
        return jewelsNum;
    }

//	Runtime: 1 ms, faster than 82.24% & Memory Usage: 37.7 MB, less than 54.41%
//	String.contains() solution
//	public int numJewelsInStones(String jewels, String stones) {
//		int jewelsNum = 0;
//		for (char c : stones.toCharArray()) {
//			if (jewels.contains(String.valueOf(c))) {
//				jewelsNum++;
//			}
//		}
//		return jewelsNum;
//	}

}
