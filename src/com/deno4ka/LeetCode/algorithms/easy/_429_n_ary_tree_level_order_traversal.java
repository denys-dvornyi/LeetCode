package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
For example, given a 3-ary tree:
We should return its level order traversal:
[
	[1],
	[3,2,4],
	[5,6]
]

Note:
The depth of the tree is at most 1000.
The total number of nodes is at most 5000.
*/

import java.util.ArrayList;
import java.util.List;

public class _429_n_ary_tree_level_order_traversal {

	public _429_n_ary_tree_level_order_traversal() {
		System.out.println(levelOrder(null)); //
	}

	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> levelOrder = new ArrayList<>();
		if (root != null) {

		}
		return levelOrder;
	}

	private class Node {
		int val;
		List<Node> children;

		public Node() {}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	}

}