package com.deno4ka.LeetCode.algorithms.easy;

/*
For a web developer, it is very important to know how to design a web page's size.
So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page,
whose length L and width W satisfy the following requirements:
	1. The area of the rectangular web page you designed must equal to the given target area.
	2. The width W should not be larger than the length L, which means L >= W.
	3. The difference between length L and width W should be as small as possible.
You need to output the length L and the width W of the web page you designed in sequence.
Example:
Input: 4
Output: [2, 2]

Explanation: The target area is 4, and all the possible ways to construct it are [1,4], [2,2], [4,1].
But according to requirement 2, [1,4] is illegal;
according to requirement 3,  [4,1] is not optimal compared to [2,2].
So the length L is 2, and the width W is 2.

Note:
The given area won't exceed 10,000,000 and is a positive integer
The web page's width and length you designed must be positive integers.
*/

public class _492_ConstructTheRectangle {

    // Runtime: 284 ms, faster than 5.96%
    public int[] constructRectangle(int area) {
        int[] resultRectangle = new int[]{area, 1};
        int differenceBetweenLengthAndWidth = area - 1;
        for (int w = area; w > 0; w--) {
            if (area % w == 0) {
                int l = area / w;
                if (w >= l && w - l < differenceBetweenLengthAndWidth) {
                    differenceBetweenLengthAndWidth = w - l;
                    resultRectangle = new int[]{w, l};
                }
            }
        }
        return resultRectangle;
    }

    // from leet.code (0ms)
//	public int[] constructRectangle(int area) {
//		int[] result = new int[2];
//		int sqrt = (int) Math.sqrt(area);
//		while (area % sqrt != 0) {
//			sqrt--;
//		}
//		int w = area / sqrt;
//		result[0] = w;
//		result[1] = sqrt;
//		return result;
//	}

}
