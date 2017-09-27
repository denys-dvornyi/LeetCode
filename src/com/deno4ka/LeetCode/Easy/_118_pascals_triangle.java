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
//        print(generate(0));
//        print(generate(1));
//        print(generate(2));
//        print(generate(3));
//        print(generate(4));
//        print(generate(5));
//        print(generate(6));
//        print(generate(7));
//        print(generate(8));
//        print(generate(9));
//        print(generate(10));
//        print(generate(11));
//        print(generate(12));
        print(generate(13));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> rowBefore = result.get(i - 1);
                    Integer a = rowBefore.get(j - 1);
                    Integer b = rowBefore.get(j);
                    row.add(a + b);
                }
            }
            result.add(row);
        }
        return result;
    }

    private void print(List<List<Integer>> pascalTriangle) {
        if (pascalTriangle == null) System.out.println("NULL");
        else {
            for (List<Integer> row : pascalTriangle) {
                System.out.println(row);
            }
        }
    }

}