package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */

import java.util.ArrayList;

public class _104_MaximumDepthOfBinaryTree {

    public _104_MaximumDepthOfBinaryTree() {
        TreeNode r1 = new TreeNode(1);
        TreeNode r2_1 = new TreeNode(2);
        TreeNode r2_2 = new TreeNode(3);
        TreeNode r3_1 = new TreeNode(3);
        TreeNode r3_3 = new TreeNode(2);
        TreeNode r4_1 = new TreeNode(4);
        TreeNode r5_1 = new TreeNode(5);
        r4_1.left = r5_1;
        r4_1.right = r5_1;
        r3_1.left = r4_1;
        r2_1.left = r3_1;
        r2_2.left = r3_3;
        r1.left = r2_1;
        r1.right = r2_2;
        System.out.println(maxDepth(r1));
    }

    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        ArrayList<Integer> depth = new ArrayList<>();
        int nesting = 0;
        getNodeDepth(root, depth, nesting);
        System.out.println(depth);
        int max = 0;
        for (int dep : depth) {
            if (max < dep) max = dep;
        }
        return max;
    }

    private void getNodeDepth(TreeNode tree, ArrayList<Integer> values, int nesting) {
        if (tree != null) {
            getNodeDepth(tree.left, values, ++nesting);
            values.add(nesting);
            getNodeDepth(tree.right, values, nesting);
        }
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