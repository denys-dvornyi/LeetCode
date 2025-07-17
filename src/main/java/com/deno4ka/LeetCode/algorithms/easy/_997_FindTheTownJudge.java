package com.deno4ka.LeetCode.algorithms.easy;

/*
In a town, there are n people labeled from 1 to n.
There is a rumor that one of these people is secretly the town judge.
If the town judge exists, then:
The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi.
Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.

Example 1:
Input: n = 2, trust = [[1,2]]
Output: 2

Example 2:
Input: n = 3, trust = [[1,3],[2,3]]
Output: 3

Example 3:
Input: n = 3, trust = [[1,3],[2,3],[3,1]]
Output: -1

Example 4:
Input: n = 3, trust = [[1,2],[2,3]]
Output: -1

Example 5:
Input: n = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
Output: 3

Constraints:
1 <= n <= 1000
0 <= trust.length <= 10(4)
trust[i].length == 2
All the pairs of trust are unique.
ai != bi
1 <= ai, bi <= n
*/

import java.util.HashSet;
import java.util.Set;

public class _997_FindTheTownJudge {

    //	Runtime: 6 ms, faster than 32.22% & Memory Usage: 48.3 MB, less than 35.39%
    public int findJudge(int n, int[][] trust) {
        Set<Integer> trustInSomebody = new HashSet<>(n);
        for (int[] trustPair : trust) {
            trustInSomebody.add(trustPair[0]);
        }
        if (trustInSomebody.size() != n - 1) return -1;

        int prospectiveJudge = -1;
        for (int i = 1; i <= n; i++) {
            if (!trustInSomebody.contains(i)) {
                prospectiveJudge = i;
                break;
            }
        }

        Set<Integer> trustInJudge = new HashSet<>(n);
        for (int[] trustPair : trust) {
            if (trustPair[1] == prospectiveJudge) {
                trustInJudge.add(trustPair[0]);
            }
        }
        if (trustInJudge.size() != n - 1) return -1;
        return prospectiveJudge;
    }

}
