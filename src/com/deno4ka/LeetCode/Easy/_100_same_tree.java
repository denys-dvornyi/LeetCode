package com.deno4ka.LeetCode.Easy;

// Given two binary trees, write a function to check if they are equal or not.
// Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

public class _100_same_tree {

    public _100_same_tree() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(2);
        System.out.println(isSameTree(p, q));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return false;
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