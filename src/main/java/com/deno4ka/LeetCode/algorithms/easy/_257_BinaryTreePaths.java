package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a binary tree, return all root-to-leaf paths.
Note: A leaf is a node with no children.

Example 1:
Input:
   1
 /   \
2     3
 \
  5
Output: ["1->2->5", "1->3"]
Explanation: All root-to-leaf paths are: 1->2->5, 1->3

Example 2:
Input:
      1
    /   \
   2     3
 /  \
5    6
Output: ["1->2->5", "1->2->6", "1->3"]
*/

import java.util.ArrayList;
import java.util.List;

public class _257_BinaryTreePaths {

	public _257_BinaryTreePaths() {
		// Example 1
//		TreeNode root = new TreeNode(1);
//		TreeNode leftNode = new TreeNode(2);
//		TreeNode rightNode = new TreeNode(3);
//		TreeNode leftRightNode = new TreeNode(5);
//		root.left = leftNode;
//		leftNode.right = leftRightNode;
//		root.right = rightNode;
//		System.out.println(binaryTreePaths(root));

		// Example 2
		TreeNode root = new TreeNode(1);
		TreeNode leftNode = new TreeNode(2);
		TreeNode rightNode = new TreeNode(3);
		TreeNode leftLeftNode = new TreeNode(5);
		TreeNode leftRightNode = new TreeNode(6);
		root.left = leftNode;
		leftNode.left = leftLeftNode;
		leftNode.right = leftRightNode;
		root.right = rightNode;
		System.out.println(binaryTreePaths(root));
	}

	// (14ms/28.55%)
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new ArrayList<>();
		if (root != null) {
			getPath(result, "", root);
		}
		return result;
	}

	private void getPath(List<String> result, String parentPath, TreeNode node) {
		if (parentPath.length() == 0) {
			parentPath += String.valueOf(node.val);
		} else {
			parentPath += "->" + String.valueOf(node.val);
		}
		if (node.left != null) {
			getPath(result, parentPath, node.left);
		}
		if (node.right != null) {
			getPath(result, parentPath, node.right);
		}
		if (node.left == null && node.right == null) {
			result.add(parentPath);
		}
	}

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}