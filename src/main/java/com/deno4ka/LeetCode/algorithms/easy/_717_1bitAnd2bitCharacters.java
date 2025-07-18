package com.deno4ka.LeetCode.algorithms.easy;

/*
We have two special characters:
The first character can be represented by one bit `0`.
The second character can be represented by two bits (`10` or `11`).
Given a binary array bits that ends with `0`, return true if the last character must be a one-bit character.

Example 1:
Input: bits = [1,0,0]
Output: true
Explanation: The only way to decode it is two-bit character and one-bit character.
So the last character is one-bit character.

Example 2:
Input: bits = [1,1,1,0]
Output: false
Explanation: The only way to decode it is two-bit character and two-bit character.
So the last character is not one-bit character.

Constraints:
1 <= bits.length <= 1000
bits[i] is either 0 or 1.
*/

public class _717_1bitAnd2bitCharacters {

    //	Runtime: 0 ms, faster than 100.00% & Memory Usage: 38.7 MB, less than 38.62%
    public boolean isOneBitCharacter(int[] bits) {
        if (bits == null || bits.length == 0) return false;
        if (bits.length == 1) return true;
        boolean isFirst = false;
        boolean isSecond = false;
        for (int bit : bits) {
            if (isSecond) {
                isSecond = false;
            } else if (bit != 0) {
                isSecond = true;
                isFirst = false;
            } else {
                isFirst = true;
            }
        }
        return isFirst;
    }

}
