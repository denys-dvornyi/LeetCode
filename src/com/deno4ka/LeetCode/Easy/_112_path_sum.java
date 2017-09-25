package com.deno4ka.LeetCode.Easy;

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

public class _112_path_sum {

    public _112_path_sum() {
        TreeNode r1 = new TreeNode(11);
        TreeNode r2_1 = new TreeNode(21);
        TreeNode r2_2 = new TreeNode(22);
        TreeNode r3_1 = new TreeNode(31);
        TreeNode r3_2 = new TreeNode(32);
        TreeNode r4_1 = new TreeNode(41);
        TreeNode r4_2 = new TreeNode(42);
        TreeNode r5_1 = new TreeNode(51);
//        r4_1.left = r5_1;
//        r3_1.left = r4_1;
//        r3_2.right = r4_2;
//        r2_1.left = r3_1;
//        r2_2.left = r3_2;
//        r1.left = r2_1;
//        r1.right = r2_2;

        System.out.println(hasPathSum(null, 0));
        System.out.println(hasPathSum(r1, 0));
        System.out.println(hasPathSum(r1, 11));
        System.out.println(hasPathSum(r1, 10));
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null && sum == 0) return true;
        else if (root == null && sum != 0) return false;
        else if (root != null && root.left == null && root.right == null && root.val == sum) return true;
        else {
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

}