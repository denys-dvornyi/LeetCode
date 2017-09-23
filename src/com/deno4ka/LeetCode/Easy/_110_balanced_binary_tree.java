package com.deno4ka.LeetCode.Easy;

/*
    Given a binary tree, determine if it is height-balanced.
    For this problem, a height-balanced binary tree is defined as a binary tree in which
 the depth of the two subtrees of every node never differ by more than 1.
*/

public class _110_balanced_binary_tree {

    public _110_balanced_binary_tree() {
        TreeNode r1 = new TreeNode(3);
        TreeNode r2_1 = new TreeNode(9);
        TreeNode r2_2 = new TreeNode(20);
        TreeNode r3_3 = new TreeNode(15);
        TreeNode r3_4 = new TreeNode(7);
        r2_2.left = r3_3;
        r2_2.right = r3_4;
        r1.left = r2_1;
        r1.right = r2_2;
        System.out.println(isBalanced(r1));
    }

    public boolean isBalanced(TreeNode root) {
        return false;
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