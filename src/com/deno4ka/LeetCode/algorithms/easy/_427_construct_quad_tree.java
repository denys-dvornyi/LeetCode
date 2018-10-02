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

public class _427_construct_quad_tree {

	public _427_construct_quad_tree() {
		System.out.println(construct(new int[][]{{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0},{1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1},{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0},{1,1,1,1,0,0,0,0}}));
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
	}

	public Node construct(int[][] grid) {
		return null;
	}

	private class Node {
		public boolean val;
		public boolean isLeaf;
		public Node topLeft;
		public Node topRight;
		public Node bottomLeft;
		public Node bottomRight;

		public Node() {}

		public Node(boolean _val, boolean _isLeaf, Node _topLeft, Node _topRight, Node _bottomLeft, Node _bottomRight) {
			val = _val;
			isLeaf = _isLeaf;
			topLeft = _topLeft;
			topRight = _topRight;
			bottomLeft = _bottomLeft;
			bottomRight = _bottomRight;
		}
	}

}