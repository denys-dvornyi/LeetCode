package com.deno4ka.LeetCode.algorithms.easy;

/*
You are given a string s of lowercase English letters and an array widths denoting how many pixels wide each lowercase English letter is.
Specifically, widths[0] is the width of 'a', widths[1] is the width of 'b', and so on.

You are trying to write s across several lines, where each line is no longer than 100 pixels.
Starting at the beginning of s, write as many letters on the first line such that the total width does not exceed 100 pixels.
Then, from where you stopped in s, continue writing as many letters as you can on the second line.
Continue this process until you have written all of s.

Return an array result of length 2 where:
result[0] is the total number of lines.
result[1] is the width of the last line in pixels.

Example 1:
Input: widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10], s = "abcdefghijklmnopqrstuvwxyz"
Output: [3,60]
Explanation: You can write s as follows:
abcdefghij  // 100 pixels wide
klmnopqrst  // 100 pixels wide
uvwxyz      // 60 pixels wide
There are a total of 3 lines, and the last line is 60 pixels wide.

Example 2:
Input: widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10], s = "bbbcccdddaaa"
Output: [2,4]
Explanation: You can write s as follows:
bbbcccdddaa  // 98 pixels wide
a            // 4 pixels wide
There are a total of 2 lines, and the last line is 4 pixels wide.

Constraints:
widths.length == 26
2 <= widths[i] <= 10
1 <= s.length <= 1000
s contains only lowercase English letters.
*/

public class _806_NumberOfLinesToWriteString {

    //	Runtime: 0 ms, faster than 100.00% & Memory Usage: 37.6 MB, less than 46.43%
    public int[] numberOfLines(int[] widths, String s) {
        final int INT_VAL_A = 'a'; // 97
        int[] result = new int[2];
        int rowSum = 0;
        int totalLines = 1;
        for (char c : s.toCharArray()) {
            int charWidth = widths[c - INT_VAL_A];
            if (rowSum + charWidth > 100) {
                totalLines++;
                rowSum = charWidth;
            } else {
                rowSum += charWidth;
            }
        }
        result[0] = totalLines;
        result[1] = rowSum;
        return result;
    }

//	without extra variables. increment inside result array
//	Runtime: 0 ms, faster than 100.00% & 37.5 MB, less than 54.20%
//	public int[] numberOfLines(int[] widths, String s) {
//		int[] result = new int[] {1, 0};
//		for (char c : s.toCharArray()) {
//			if (result[1] + widths[c - 'a'] > 100) {
//				result[0]++;
//				result[1] = widths[c - 'a'];
//			} else {
//				result[1] += widths[c - 'a'];
//			}
//		}
//		return result;
//	}

}
