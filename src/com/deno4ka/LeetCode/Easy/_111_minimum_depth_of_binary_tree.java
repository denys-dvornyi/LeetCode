package com.deno4ka.LeetCode.Easy;
/*
    Given a binary tree, find its minimum depth.
    The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
*/
public class _111_minimum_depth_of_binary_tree {

    public _111_minimum_depth_of_binary_tree() {

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

        System.out.println(minDepth(r1));
    }

    public int minDepth(TreeNode root) {
        int minDepth = 0;
        if (root == null) return minDepth;
        else {

        }
        return minDepth;
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