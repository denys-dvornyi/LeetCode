package com.deno4ka.LeetCode.algorithms.easy;

/*
Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
*/

public class _404_sum_of_left_leaves {

	public _404_sum_of_left_leaves() {
		TreeNode root = new TreeNode(3);
		TreeNode left = new TreeNode(9);
		TreeNode right = new TreeNode(20);
		TreeNode rLeft = new TreeNode(15);
		TreeNode rRight = new TreeNode(7);
		root.left = left;
		root.right = right;
		right.left = rLeft;
		right.right = rRight;
		System.out.println(sumOfLeftLeaves(root)); // 24
	}

	public int sumOfLeftLeaves(TreeNode root) {
		int sum = 0;
		if (root != null) {

		}
		return sum;
	}

	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}