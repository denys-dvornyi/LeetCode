package com.deno4ka.LeetCode.Easy;

/*
Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */

public class _104_maximum_depth_of_binary_tree {

    public _104_maximum_depth_of_binary_tree() {
        TreeNode root = new TreeNode(1);
        System.out.println(maxDepth(root));
    }

    public int maxDepth(TreeNode root) {

        return -1;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}