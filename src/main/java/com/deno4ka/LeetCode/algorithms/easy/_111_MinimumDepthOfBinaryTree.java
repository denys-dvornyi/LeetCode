package com.deno4ka.LeetCode.algorithms.easy;

import java.util.ArrayList;

/*
    Given a binary tree, find its minimum depth.
    The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
*/
public class _111_MinimumDepthOfBinaryTree {

    public _111_MinimumDepthOfBinaryTree() {

        TreeNode r1 = new TreeNode(11);
        TreeNode r2_1 = new TreeNode(21);
        TreeNode r2_2 = new TreeNode(22);
        TreeNode r3_1 = new TreeNode(31);
        TreeNode r3_2 = new TreeNode(32);
        TreeNode r4_1 = new TreeNode(41);
        TreeNode r4_2 = new TreeNode(42);
        TreeNode r5_1 = new TreeNode(51);
        r4_1.left = r5_1;
        r3_1.left = r4_1;
        r3_2.right = r4_2;
        r2_1.left = r3_1;
        r2_2.left = r3_2;
        r1.left = r2_1;
        r1.right = r2_2;

        System.out.println(minDepth(r1));
    }

    // code from LeetCode
//    public int minDepth(TreeNode root) {
//        if (root==null) { return 0; }
//        if (root.left==null) { return 1 + minDepth(root.right); }
//        if (root.right==null) { return 1 + minDepth(root.left); }
//        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
//    }

    private int minDepth(TreeNode root) {
        if (root == null) return 0;
        ArrayList<Integer> depths = new ArrayList<>();
        int depth = 1;
        getNodeDepth(root, depths, depth);
        System.out.println(depths);
        int min = Integer.MAX_VALUE;
        for (int dep : depths) {
            if (min > dep) min = dep;
        }
        return min;
    }

    private void getNodeDepth(TreeNode tree, ArrayList<Integer> depths, int depth) {
        if (tree != null) {
            if (tree.left == null && tree.right == null) {
                System.out.println("Leaf found! Nesting=" + depth);
                depths.add(depth);
            }
            getNodeDepth(tree.left, depths, ++depth);
            getNodeDepth(tree.right, depths, depth);
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}