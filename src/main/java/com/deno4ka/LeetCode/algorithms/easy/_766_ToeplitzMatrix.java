package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.
A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.

Example 1:
Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
Output: true
Explanation:
In the above grid, the diagonals are:
"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
In each diagonal all elements are the same, so the answer is True.

Example 2:
Input: matrix = [[1,2],[2,2]]
Output: false
Explanation:
The diagonal "[1, 2]" has different elements.

Constraints:
m == matrix.length
n == matrix[i].length
1 <= m, n <= 20
0 <= matrix[i][j] <= 99
*/

public class _766_ToeplitzMatrix {

    //	Runtime: 1 ms, faster than 83.45% & Memory Usage: 39.4 MB, less than 50.72%
    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix.length == 1) return true;
        int rowMax = matrix.length - 1;
        int colMin = 0;
        boolean newDiagonal = true;
        int cellValue = -1;
        while (rowMax != 0 || colMin != matrix[0].length - 1) {
            int i = rowMax;
            for (int j = colMin; j < matrix[0].length && i < matrix.length; ) {
                if (newDiagonal) {
                    cellValue = matrix[i++][j++];
                    newDiagonal = false;
                } else {
                    if (cellValue != matrix[i++][j++]) {
                        return false;
                    }
                }
            }
            int whatever = rowMax > 0 ? rowMax-- : colMin++;
            newDiagonal = true;
        }
        return true;
    }

//  best from leet.code (0ms)
//	public boolean isToeplitzMatrix(int[][] matrix) {
//		int m = matrix.length;
//		int n = matrix[0].length;
//		for (int i = 1; i < m; i++) {
//			for (int j = 1; j < n; j++) {
//				if (matrix[i][j] != matrix[i - 1][j - 1]) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}

}
