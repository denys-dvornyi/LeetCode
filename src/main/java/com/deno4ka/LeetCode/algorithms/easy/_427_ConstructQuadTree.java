package com.deno4ka.LeetCode.algorithms.easy;

/*
We want to use quad trees to store an N x N boolean grid. Each cell in the grid can only be true or false.
The root node represents the whole grid.
For each node, it will be subdivided into four children nodes until the values in the region it represents are all the same.
Each node has another two boolean attributes : isLeaf and val. isLeaf is true if and only if the node is a leaf node.
The val attribute for a leaf node contains the value of the region it represents.
Your task is to use a quad tree to represent a given grid. The following example may help you understand the problem better:
Given the 8 x 8 grid below, we want to construct the corresponding quad tree:
It can be divided according to the definition above:
The corresponding quad tree should be as following, where each node is represented as a (isLeaf, val) pair.
For the non-leaf nodes, val can be arbitrary, so it is represented as *.

Note:
N is less than 1000 and guaranteened to be a power of 2.
*/

public class _427_ConstructQuadTree {

	public _427_ConstructQuadTree() {
//		System.out.println(construct(new int[][]{{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0},{1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1},{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0}}));
		/*
		{
		  "$id": "1",
		  "bottomLeft": {
		    "$id": "8",
		    "bottomLeft": null,
		    "bottomRight": null,
		    "isLeaf": true,
		    "topLeft": null,
		    "topRight": null,
		    "val": true
		  },
		  "bottomRight": {
		    "$id": "9",
		    "bottomLeft": null,
		    "bottomRight": null,
		    "isLeaf": true,
		    "topLeft": null,
		    "topRight": null,
		    "val": false
		  },
		  "isLeaf": false,
		  "topLeft": {
		    "$id": "2",
		    "bottomLeft": null,
		    "bottomRight": null,
		    "isLeaf": true,
		    "topLeft": null,
		    "topRight": null,
		    "val": true
		  },
		  "topRight": {
		    "$id": "3",
		    "bottomLeft": {
		      "$id": "6",
		      "bottomLeft": null,
		      "bottomRight": null,
		      "isLeaf": true,
		      "topLeft": null,
		      "topRight": null,
		      "val": true
		    },
		    "bottomRight": {
		      "$id": "7",
		      "bottomLeft": null,
		      "bottomRight": null,
		      "isLeaf": true,
		      "topLeft": null,
		      "topRight": null,
		      "val": true
		    },
		    "isLeaf": false,
		    "topLeft": {
		      "$id": "4",
		      "bottomLeft": null,
		      "bottomRight": null,
		      "isLeaf": true,
		      "topLeft": null,
		      "topRight": null,
		      "val": false
		    },
		    "topRight": {
		      "$id": "5",
		      "bottomLeft": null,
		      "bottomRight": null,
		      "isLeaf": true,
		      "topLeft": null,
		      "topRight": null,
		      "val": false
		    },
		    "val": true
		  },
		  "val": true
		}
		*/
//		System.out.println(construct(new int[][]{{1}})); //
//		System.out.println(construct(new int[][]{{1,1},{1,1}})); //
//		System.out.println(construct(new int[][]{{1,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,1,1}})); //
		System.out.println(construct(new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}})); //
	}

	// (6ms/11.29%)
	public Node construct(int[][] grid) {
		Node result = new Node();
		int gridLength = grid.length;
		if (gridLength == 1) {
			result = new Node(grid[0][0] == 1, true, null, null, null, null);
		} else {
			boolean isAllValuesEquals = checkAllValues(grid);
			if (isAllValuesEquals) {
				return new Node(grid[0][0] == 1, true, null, null, null, null);
			}
			int isTopLeftLeaf = isLeaf(grid, 0, gridLength / 2, 0, gridLength / 2);
			if (isTopLeftLeaf != -1) { // this is leaf
				result.topLeft = new Node(isTopLeftLeaf == 1, true, null, null, null, null);
			} else {
				result.isLeaf = false;
				int[][] subArray = getSubArray(grid, 0, gridLength / 2, 0, gridLength / 2);
				result.topLeft = construct(subArray);
			}
			int isTopRightLeaf = isLeaf(grid, 0, gridLength / 2, gridLength / 2, gridLength);
			if (isTopRightLeaf != -1) { // this is leaf
				result.topRight = new Node(isTopRightLeaf == 1, true, null, null, null, null);;
			} else {
				result.isLeaf = false;
				int[][] subArray = getSubArray(grid, 0, gridLength / 2, gridLength / 2, gridLength);
				result.topRight = construct(subArray);
			}
			int isBottomLeftLeaf = isLeaf(grid, gridLength / 2, gridLength, 0, gridLength / 2);
			if (isBottomLeftLeaf != -1) { // this is leaf
				result.bottomLeft = new Node(isBottomLeftLeaf == 1, true, null, null, null, null);;
			} else {
				result.isLeaf = false;
				int[][] subArray = getSubArray(grid, gridLength / 2, gridLength, 0, gridLength / 2);
				result.bottomLeft = construct(subArray);
			}
			int isBottomRightLeaf = isLeaf(grid, gridLength / 2, gridLength, gridLength / 2, gridLength);
			if (isBottomRightLeaf != -1) { // this is leaf
				result.bottomRight = new Node(isBottomRightLeaf == 1, true, null, null, null, null);;
			} else {
				result.isLeaf = false;
				int[][] subArray = getSubArray(grid, gridLength / 2, gridLength, gridLength / 2, gridLength);
				result.bottomRight = construct(subArray);
			}
		}
		return result;
	}

	private boolean checkAllValues(int[][] grid) {
		int val = grid[0][0];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (val != grid[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	private int[][] getSubArray(int[][] grid, int start1, int end1, int start2, int end2) {
		int[][] subArray = new int[end1 - start1][end2 - start2];
		int row = 0, col;
		for (int i = start1; i < end1; i++) {
			col = 0;
			for (int j = start2; j < end2; j++) {
				subArray[row][col] = grid[i][j];
				col++;
			}
			row++;
		}
		return subArray;
	}

	private int isLeaf(int[][] grid, int start1, int end1, int start2, int end2) {
		int val = -1;
		for (int i = start1; i < end1; i++) {
			for (int j = start2; j < end2; j++) {
				if (val == -1) {
					val = grid[i][j];
				} else {
					if (val != grid[i][j]) {
						return -1;
					}
				}
			}
		}
		return val;
	}

	private class Node {
		boolean val;
		boolean isLeaf;
		Node topLeft;
		Node topRight;
		Node bottomLeft;
		Node bottomRight;

		public Node() {}

		public Node(boolean _val, boolean _isLeaf, Node _topLeft, Node _topRight, Node _bottomLeft, Node _bottomRight) {
			val = _val;
			isLeaf = _isLeaf;
			topLeft = _topLeft;
			topRight = _topRight;
			bottomLeft = _bottomLeft;
			bottomRight = _bottomRight;
		}

		@Override
		public String toString() {
			return "{" +
					"\"val\":" + val +
					",\"isLeaf\":" + isLeaf +
					",\"topLeft\":" + topLeft +
					",\"topRight\":" + topRight +
					",\"bottomLeft\":" + bottomLeft +
					",\"bottomRight\":" + bottomRight +
					'}';
		}
	}

}