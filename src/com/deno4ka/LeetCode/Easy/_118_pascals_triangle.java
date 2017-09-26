package com.deno4ka.LeetCode.Easy;

/*
Given numRows, generate the first numRows of Pascal's triangle.
For example, given numRows = 5,
Return
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/

import java.util.ArrayList;
import java.util.List;

public class _118_pascals_triangle {

    public _118_pascals_triangle() {
        System.out.println(generate(0));
//        System.out.println(generate(1));
//        System.out.println(generate(2));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return null;
        } else {
            return result;
        }
    }

}