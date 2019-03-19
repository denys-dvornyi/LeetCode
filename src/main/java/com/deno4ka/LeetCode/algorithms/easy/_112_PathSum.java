package com.deno4ka.LeetCode.algorithms.easy;

/*
 Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
For example:
Given the below binary tree and sum = 22,
      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
*/

import java.util.ArrayList;

public class _112_PathSum {

    public _112_PathSum() {
        TreeNode r1 = new TreeNode(5);
        TreeNode r2_1 = new TreeNode(4);
        TreeNode r2_2 = new TreeNode(8);
        TreeNode r3_1 = new TreeNode(11);
        TreeNode r3_3 = new TreeNode(13);
        TreeNode r3_4 = new TreeNode(4);
        TreeNode r4_1 = new TreeNode(7);
        TreeNode r4_2 = new TreeNode(2);
        TreeNode r4_3 = new TreeNode(1);
        r3_1.left = r4_1;
        r3_1.right = r4_2;
        r3_4.right = r4_3;
        r2_1.left = r3_1;
        r2_2.left = r3_3;
        r2_2.right = r3_4;
        r1.left = r2_1;
        r1.right = r2_2;

//        System.out.println(hasPathSum(null, 0));
//        System.out.println(hasPathSum(r1, 0));
        System.out.println(hasPathSum(r1, 27));
    }

//    code from LeetCode
//    public boolean hasPathSum(TreeNode root, int sum) {
//        if (root == null) return false;
//
//        // the node must be leaf node to return true
//        if (root.left == null && root.right == null && (sum - root.val == 0)) return true;
//
//        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
//    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        else if (root != null && root.left == null && root.right == null && root.val == sum) return true;
        else {
            ArrayList<Integer> sums = new ArrayList<>();
            int depth = root.val;
            getNodeSum(root, sums, depth);
            System.out.println(sums);
            for (int i = 0; i < sums.size(); i++) {
                int summ = sums.get(i);
                if (summ == sum) {
                    return true;
                }
            }
            return false;
        }
    }

    private void getNodeSum(TreeNode tree, ArrayList<Integer> depths, int sum) {
        if (tree != null) {
            if (tree.left == null && tree.right == null) {
                System.out.println("Leaf found! Sum=" + sum);
                depths.add(sum);
            }
            if (tree.left != null) {
                getNodeSum(tree.left, depths, sum + tree.left.val);
            }
            if (tree.right != null) {
                getNodeSum(tree.right, depths, sum + tree.right.val);
            }
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