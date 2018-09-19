package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q
as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
Given binary search tree:  root = [6,2,8,0,4,7,9,null,null,3,5]

        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5

Example 1:
Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.

Example 2:
Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
Output: 2
Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself
             according to the LCA definition.

Note:
All of the nodes' values will be unique.
p and q are different and both values will exist in the BST.
*/

import java.util.Objects;
import java.util.StringJoiner;

public class _235_lowest_common_ancestor_of_a_binary_search_tree {

	public _235_lowest_common_ancestor_of_a_binary_search_tree() {
		TreeNode root = new TreeNode(6);
		TreeNode leftNode = new TreeNode(2);
		TreeNode leftLeftNode = new TreeNode(0);
		TreeNode leftRightNode = new TreeNode(4);
		TreeNode leftRightLeftNode = new TreeNode(3);
		TreeNode leftRightRightNode = new TreeNode(5);
		TreeNode rightNode = new TreeNode(8);
		TreeNode rightLeftNode = new TreeNode(7);
		TreeNode rightRightNode = new TreeNode(9);
		root.left = leftNode;
		leftNode.left = leftLeftNode;
		leftNode.right = leftRightNode;
		leftRightNode.left = leftRightLeftNode;
		leftRightNode.right = leftRightRightNode;
		root.right = rightNode;
		rightNode.left = rightLeftNode;
		rightNode.right = rightRightNode;

		StringJoiner treeNodeAsString = new StringJoiner("-");
		treeNodeToString(root, treeNodeAsString);
		System.out.println(treeNodeAsString);

		System.out.println(lowestCommonAncestor(root, new TreeNode(6), new TreeNode(0))); // 6
		System.out.println(lowestCommonAncestor(root, new TreeNode(9), new TreeNode(6))); // 6
		System.out.println(lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8))); // 6
		System.out.println(lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4))); // 2
	}

	// (11ms/9.42%)
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root != null) {
			if (root.equals(p) || root.equals(q)) {
				return root;
			} else if (root.val > p.val && root.val < q.val || root.val > q.val && root.val < p.val) {
				return root;
			} else if (root.val > p.val && root.val > q.val) {
				return lowestCommonAncestor(root.left, p, q);
			} else if (root.val < p.val && root.val < q.val) {
				return lowestCommonAncestor(root.right, p, q);
			}
		}
		return root;
	}

	// best from leet.code
//	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//		if(root.val > p.val && root.val > q.val){
//			return lowestCommonAncestor(root.left, p, q);
//		}else if(root.val < p.val && root.val < q.val){
//			return lowestCommonAncestor(root.right, p, q);
//		}else{
//			return root;
//		}
//	}

	private void treeNodeToString(TreeNode root, StringJoiner treeNodeAsString) {
		if (root != null) {
			treeNodeToString(root.left, treeNodeAsString);
			treeNodeAsString.add(String.valueOf(root.val));
			treeNodeToString(root.right, treeNodeAsString);
		}
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}

		@Override
		public String toString() {
			return String.valueOf(val);
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			TreeNode treeNode = (TreeNode) o;
			return val == treeNode.val;
		}

		@Override
		public int hashCode() {
			return Objects.hash(val);
		}
	}

}