package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an index k, return the kth row of the Pascal's triangle.
For example, given k = 3,
Return [1,3,3,1].
Note:
Could you optimize your algorithm to use only O(k) extra space?
*/

import java.util.ArrayList;
import java.util.List;

public class _119_PascalsTriangle2 {

    public _119_PascalsTriangle2() {
//        System.out.println(getRow(0));
//        System.out.println(getRow(1));
//        System.out.println(getRow(2));
        System.out.println(getRow(3));
//        System.out.println(getRow(4));
//        System.out.println(getRow(5));
//        System.out.println(getRow(6));
//        System.out.println(getRow(7));
    }

    // best speed from LeetCode
//    public List<Integer> getRow(int rowIndex) {
//        Integer[] rowList = new Integer[rowIndex+1];
//        rowList[0] = 1;
//        for(int i=1; i<rowList.length;i++) {
//            rowList[i] = (int)((long)rowList[i-1]*(rowIndex-(i-1))/(i));
//        }
//        return Arrays.asList(rowList);
//    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> rowBefore = pascalTriangle.get(i - 1);
                    Integer a = rowBefore.get(j - 1);
                    Integer b = rowBefore.get(j);
                    row.add(a + b);
                }
            }
            pascalTriangle.add(row);
        }
        if (rowIndex >= 0) {
            result = pascalTriangle.get(rowIndex);
        }
        return result;
    }

}