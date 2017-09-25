package com.deno4ka.LeetCode.Easy;

/*
    Given a binary tree, determine if it is height-balanced.
    For this problem, a height-balanced binary tree is defined as a binary tree in which
 the depth of the two subtrees of every node never differ by more than 1.
*/

import java.util.ArrayList;

public class _110_balanced_binary_tree {

    public _110_balanced_binary_tree() {
        TreeNode r1 = new TreeNode(11);
        TreeNode r2_1L = new TreeNode(21);
        TreeNode r2_2R = new TreeNode(22);
        TreeNode r3_1L = new TreeNode(31);
        TreeNode r3_2R = new TreeNode(32);
        TreeNode r3_3L = new TreeNode(33);
        TreeNode r3_4R = new TreeNode(34);
        TreeNode r4_1L = new TreeNode(41);
        TreeNode r4_2 = new TreeNode(42);
        TreeNode r4_3 = new TreeNode(43);
        TreeNode r4_4 = new TreeNode(44);
        TreeNode r5_1 = new TreeNode(51);
        TreeNode r5_2 = new TreeNode(52);
        TreeNode r6_1 = new TreeNode(61);

//        r5_1.left = r6_1;

//        r4_1L.left = r5_1;
//        r4_2.right = r5_2;

        r3_1L.left = r4_1L;
//        r3_1L.right = r4_1;
//        r3_2R.left = r4_2;
//        r3_2R.right = r4_2;
        r3_3L.left = r4_3;
        r3_3L.right = r4_3;
//        r3_4R.left = r4_4;
        r3_4R.right = r4_4;

        r2_1L.left = r3_1L;
        r2_1L.right = r3_2R;
//        r2_2R.left = r3_3L;
        r2_2R.right = r3_4R;

        r1.left = r2_1L;
        r1.right = r2_2R;
        System.out.println(isBalanced(r1));
    }

    public boolean isBalanced(TreeNode root) {
        ArrayList<Boolean> isBalanced = new ArrayList<>();
        checkBalance(root, isBalanced);
        for(Boolean bal:isBalanced) {
            if (!bal) return false;
        }
        return true;
    }

    private void checkBalance(TreeNode root, ArrayList<Boolean> isBalanced) {
        if (root == null) return;
        else if (root.left == null && root.right == null) return;
        else {
            int leftTree = maxDepth(root.left);
            int rightTree = maxDepth(root.right);
            int difference = 0;
            if (leftTree >= rightTree) {
                difference = leftTree - rightTree;
            } else {
                difference = rightTree - leftTree;
            }
            if (difference <= 1) {
                isBalanced.add(true);
            } else {
                isBalanced.add(false);
                return;
            }
        }
        if (root.left != null) {
            checkBalance(root.left, isBalanced);
        }
        if (root.right != null) {
            checkBalance(root.right, isBalanced);
        }
    }

    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        ArrayList<Integer> depth = new ArrayList<>();
        int nesting = 0;
        getNodeDepth(root, depth, nesting);
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