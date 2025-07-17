package com.deno4ka.LeetCode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/*
In a string s of lowercase letters, these letters form consecutive groups of the same character.
For example, a string like s = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z", and "yy".
A group is identified by an interval [start, end], where start and end denote the start and end indices (inclusive) of the group.
In the above example, "xxxx" has the interval [3,6].
A group is considered large if it has 3 or more characters.
Return the intervals of every large group sorted in increasing order by start index.

Example 1:
Input: s = "abbxxxxzzy"
Output: [[3,6]]
Explanation: "xxxx" is the only large group with start index 3 and end index 6.

Example 2:
Input: s = "abc"
Output: []
Explanation: We have groups "a", "b", and "c", none of which are large groups.

Example 3:
Input: s = "abcdddeeeeaabbbcd"
Output: [[3,5],[6,9],[12,14]]
Explanation: The large groups are "ddd", "eeee", and "bbb".

Example 4:
Input: s = "aba"
Output: []

Constraints:
1 <= s.length <= 1000
s contains lower-case English letters only.
*/

public class _830_PositionsOfLargeGroups {

    //	Runtime: 1 ms, faster than 100.00% & Memory Usage: 39.3 MB, less than 63.41%
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        char groupCharacter = s.charAt(0);
        int cursor = 0;
        int groupSize = 1;
        for (int i = 1; i < s.length(); i++) {
            if (groupCharacter == s.charAt(i)) {
                groupSize++;
            } else {
                if (groupSize > 2) {
                    result.add(List.of(cursor, cursor + groupSize - 1));
                }
                groupCharacter = s.charAt(i);
                cursor = i;
                groupSize = 1;
            }
        }
        if (groupSize > 2) {
            result.add(List.of(cursor, cursor + groupSize - 1));
        }
        return result;
    }

}
