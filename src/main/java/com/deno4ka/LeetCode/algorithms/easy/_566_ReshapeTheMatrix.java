package com.deno4ka.LeetCode.algorithms.easy;

/*
In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Example 1:
Input: nums = [[1,2], [3,4]]
r = 1, c = 4
Output: [[1,2,3,4]]
Explanation: The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.

Example 2:
Input:
nums = [[1,2], [3,4]]
r = 2, c = 4
Output: [[1,2], [3,4]]
Explanation: There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.

Note:
The height and width of the given matrix is in range [1, 100].
The given r and c are all positive.
*/

public class _566_ReshapeTheMatrix {

	public int[][] matrixReshape(int[][] nums, int r, int c) {
		if (nums == null) return null;
		int currentMatrixDimension = nums.length * nums[0].length;
		int reshapedMatrixDimension = r * c;
		if (currentMatrixDimension != reshapedMatrixDimension) return nums;
		if (nums.length == r && nums[0].length == c) return nums;
		int[][] reshapedMatrix = new int[r][c];
		int cursor = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (cursor == 0) {
					reshapedMatrix[0][0] = nums[i][j];
				} else {
					int row = cursor / c;
					int col = cursor - row * c;
					reshapedMatrix[row][col] = nums[i][j];
				}
				cursor++;
			}
		}
		return reshapedMatrix;
	}

}
