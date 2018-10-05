package com.deno4ka.LeetCode.algorithms.easy;

/*
You are given a binary tree in which each node contains an integer value.
Find the number of paths that sum to a given value.
The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).
The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.
Example:
root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
      10
     /  \
    5   -3
   / \    \
  3   2   11
 / \   \
3  -2   1
Return 3. The paths that sum to 8 are:
1.  5 -> 3
2.  5 -> 2 -> 1
3. -3 -> 11
*/

import java.util.ArrayList;
import java.util.HashMap;

public class _437_path_sum_3 {


	public _437_path_sum_3() {
//		TreeNode root = new TreeNode(10);
//		TreeNode left = new TreeNode(5);
//		TreeNode right = new TreeNode(-3);
//		TreeNode leftLeft = new TreeNode(3);
//		TreeNode leftRight = new TreeNode(2);
//		TreeNode rightRight = new TreeNode(11);
//		TreeNode leftLeftLeft = new TreeNode(3);
//		TreeNode leftLeftRight = new TreeNode(-2);
//		TreeNode leftRightRight = new TreeNode(1);
//		root.left = left;
//		root.right = right;
//		right.right = rightRight;
//		left.left = leftLeft;
//		left.right = leftRight;
//		leftRight.right = leftRightRight;
//		leftLeft.left = leftLeftLeft;
//		leftLeft.right = leftLeftRight;
//		System.out.println(pathSum(root, 3)); // 3
//		[10,5,-3,3,2,null,11,3,-2,null,1]

//		System.out.println(pathSum(new TreeNode(1), 1)); // 1

//		TreeNode root = new TreeNode(1);
//		TreeNode left = new TreeNode(-2);
//		TreeNode right = new TreeNode(-3);
//		TreeNode leftLeft = new TreeNode(1);
//		TreeNode leftRight = new TreeNode(3);
//		TreeNode rightLeft = new TreeNode(-2);
//		TreeNode leftLeftLeft = new TreeNode(-1);
//		root.left = left;
//		root.right = right;
//		right.left = rightLeft;
//		left.left = leftLeft;
//		left.right = leftRight;
//		leftLeft.left = leftLeftLeft;
//		System.out.println(pathSum(root, 3)); // 1
		//[1,-2,-3,1,3,-2,null,-1]

		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		root.left = left;
		System.out.println(pathSum(root, 2)); // 1
		//[1,2], 2
	}

	public int pathSum(TreeNode root, int sum) {
		int result = 0;
		if (root != null) {
			ArrayList<ArrayList<Integer>> pathes = new ArrayList<>();
			getPath(pathes, new ArrayList<>(), root, true);
			TreeNode rightCursor = root;
			TreeNode leftCursor = root;
			while (rightCursor != null || leftCursor != null) {
				if (rightCursor != null) {
					rightCursor = rightCursor.right;
					if (rightCursor != null) {
						getPath(pathes, new ArrayList<>(), rightCursor, true);
					}
				}
				if (leftCursor != null) {
					leftCursor = leftCursor.left;
					if (leftCursor != null) {
						getPath(pathes, new ArrayList<>(), leftCursor, true);
					}
				}
			}
//			System.out.println(pathes);
//			System.out.println(pathes.size());
			HashMap<Integer, Integer> sumPathes = new HashMap<>();
			for (ArrayList<Integer> path : pathes) {
				int sumPath = path.stream().mapToInt(Integer::intValue).sum();
				if (!sumPathes.containsKey(sumPath)) {
					sumPathes.put(sumPath, 1);
				} else {
					sumPathes.put(sumPath, sumPathes.get(sumPath) + 1);
				}
			}
			if (sumPathes.containsKey(sum)) {
				result = sumPathes.get(sum);
			}
			System.out.println(sumPathes);
		}
		return result;
	}

	private void getPath(ArrayList<ArrayList<Integer>> pathes, ArrayList<Integer> parentPath, TreeNode node, boolean isRoot) {
		if (node != null) {
			if (node.left == null && node.right == null && parentPath.size() == 1 && !isRoot) {
				ArrayList<Integer> leaf = new ArrayList<>();
				leaf.add(node.val);
				pathes.add(leaf);
			}

			parentPath.add(node.val);
			if (parentPath.size() > 1) {
				pathes.add(new ArrayList<>(parentPath));
			}
			if (isRoot) {
				pathes.add(new ArrayList<>(parentPath));
			}

			getPath(pathes, new ArrayList<>(parentPath), node.left, false);
			getPath(pathes, new ArrayList<>(parentPath), node.right, false);
		}
	}

	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

		@Override
		public String toString() {
			return "{" +
					"\"val\":" + val +
					", \"left\":" + left +
					", \"right\":" + right +
					'}';
		}
	}

}