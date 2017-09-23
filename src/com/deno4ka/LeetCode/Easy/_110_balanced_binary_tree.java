package com.deno4ka.LeetCode.Easy;

/*
    Given a binary tree, determine if it is height-balanced.
    For this problem, a height-balanced binary tree is defined as a binary tree in which
 the depth of the two subtrees of every node never differ by more than 1.
*/

import java.util.ArrayList;

public class _110_balanced_binary_tree {

    public _110_balanced_binary_tree() {
        TreeNode r1 = new TreeNode(1);
        TreeNode r2_1 = new TreeNode(21);
        TreeNode r2_2 = new TreeNode(22);
        TreeNode r3_1 = new TreeNode(31);
        TreeNode r3_2 = new TreeNode(32);
        TreeNode r3_3 = new TreeNode(33);
        TreeNode r3_4 = new TreeNode(34);
        TreeNode r4_1 = new TreeNode(41);
        TreeNode r4_2 = new TreeNode(42);
        TreeNode r4_3 = new TreeNode(43);
        TreeNode r4_4 = new TreeNode(44);
        TreeNode r5_1 = new TreeNode(51);
        TreeNode r5_2 = new TreeNode(52);
        TreeNode r6_1 = new TreeNode(61);

        r5_1.left = r6_1;

        r4_1.left = r5_1;
        r4_2.right = r5_2;

        r3_1.left = r4_1;
        r3_2.left = r4_2;
        r3_3.left = r4_3;
        r3_4.left = r4_4;

        r2_1.left = r3_1;
        r2_1.right = r3_2;
        r2_2.left = r3_3;
        r2_2.right = r3_4;

        r1.left = r2_1;
        r1.right = r2_2;
        System.out.println(isBalanced(r1));
    }

    public boolean isBalanced(TreeNode root) {
        return checkBalance(root);
    }

    private boolean checkBalance(TreeNode root) {
        if (root == null) return true;
        else if (root.left == null && root.right == null) return true;
        else {
            int leftTree = maxDepth(root.left);
            int rightTree = maxDepth(root.right);
            int difference = 0;
            if (leftTree >= rightTree) {
                difference = leftTree - rightTree;
            } else {
                difference = rightTree - leftTree;
            }
            return difference <= 1;
        }
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

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}