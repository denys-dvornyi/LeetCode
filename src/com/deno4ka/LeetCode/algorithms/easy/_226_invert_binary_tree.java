package com.deno4ka.LeetCode.algorithms.easy;

/*
Invert a binary tree.

Example:
Input:
     4
   /   \
  2     7
 / \   / \
1   3 6   9

Output:
     4
   /   \
  7     2
 / \   / \
9   6 3   1

Trivia:
This problem was inspired by this original tweet by Max Howell:
Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off.
*/

import java.util.StringJoiner;

public class _226_invert_binary_tree {

	private TreeNode invertedTreeNode;
	private StringJoiner treeNodeAsString;

	// from leet.code
//	public TreeNode invertTree(TreeNode root) {
//		if(root == null)
//			return null;
//		// invert left & right
//		TreeNode left = invertTree(root.left);
//		TreeNode right = invertTree(root.right);
//		// Swap left & right
//		root.left = right;
//		root.right = left;
//		return root;
//	}

	// my solution (0ms/100%)
	public _226_invert_binary_tree() {
		TreeNode root = new TreeNode(4);
		TreeNode leftRoot = new TreeNode(2);
		TreeNode leftLeftNode = new TreeNode(1);
		TreeNode leftRightNode = new TreeNode(3);
		TreeNode rightRoot = new TreeNode(7);
		TreeNode rightLeftNode = new TreeNode(6);
		TreeNode rightRightNode = new TreeNode(9);
		root.left = leftRoot;
		root.right = rightRoot;
		leftRoot.left = leftLeftNode;
		leftRoot.right = leftRightNode;
		rightRoot.left = rightLeftNode;
		rightRoot.right = rightRightNode;

		treeNodeAsString = new StringJoiner("-");
		printTreeNode(root);
		System.out.println(treeNodeAsString.toString());

		treeNodeAsString = new StringJoiner("-");
		invertTree(root);
		printTreeNode(invertedTreeNode);
		System.out.println(treeNodeAsString.toString());
	}

	public TreeNode invertTree(TreeNode root) {
		if (root != null) {
			invert(invertedTreeNode, root);
		}
		return invertedTreeNode;
	}

	private void invert(TreeNode invertedNode, TreeNode originalNode) {
		if (invertedNode == null) {
			invertedNode = new TreeNode(originalNode.val);
		}
		if (invertedTreeNode == null) {
			invertedTreeNode = invertedNode;
		}
		if (originalNode.right != null) {
			invertedNode.left = new TreeNode(originalNode.right.val);
			invert(invertedNode.left, originalNode.right);
		}
		if (originalNode.left != null) {
			invertedNode.right = new TreeNode(originalNode.left.val);
			invert(invertedNode.right, originalNode.left);
		}
	}

	private void printTreeNode(TreeNode root) {
		if (root != null) {
			printTreeNode(root.left);
			treeNodeAsString.add(String.valueOf(root.val));
			printTreeNode(root.right);
		}
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