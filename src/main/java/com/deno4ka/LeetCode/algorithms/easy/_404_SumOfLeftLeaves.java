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

public class _404_SumOfLeftLeaves {

    public _404_SumOfLeftLeaves() {
//		TreeNode root = new TreeNode(3);
//		TreeNode left = new TreeNode(9);
//		TreeNode right = new TreeNode(20);
//		TreeNode rLeft = new TreeNode(15);
//		TreeNode rRight = new TreeNode(7);
//		root.left = left;
//		root.right = right;
//		right.left = rLeft;
//		right.right = rRight;
//		System.out.println(sumOfLeftLeaves(root)); // 24

//		TreeNode root = new TreeNode(1);
//		TreeNode left = new TreeNode(2);
//		TreeNode lLeft = new TreeNode(4);
//		TreeNode right = new TreeNode(3);
//		TreeNode rRight = new TreeNode(5);
//		root.left = left;
//		root.right = right;
//		left.left = lLeft;
//		right.right = rRight;
//		System.out.println(sumOfLeftLeaves(root)); // 4

        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode lLeft = new TreeNode(4);
        TreeNode lRight = new TreeNode(8);
        TreeNode right = new TreeNode(3);
        TreeNode rRight = new TreeNode(5);
        TreeNode rLeft = new TreeNode(6);
        TreeNode rLLeft = new TreeNode(7);
        TreeNode rRLeft = new TreeNode(9);
        root.left = left;
        root.right = right;
        left.left = lLeft;
        left.right = lRight;
        right.right = rRight;
        right.left = rLeft;
        rLeft.left = rLLeft;
        lRight.left = rRLeft;
        System.out.println(sumOfLeftLeaves(root)); // 20
    }

    // (5ms/78.79%)
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if (root != null) {
            if (root.left != null && root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            }
            sum += sumOfLeftLeaves(root.left);
            sum += sumOfLeftLeaves(root.right);
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