package com.deno4ka.LeetCode.Easy;

/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
For example, this binary tree [1, 2,2, 3,4,4,3, 5,6,7,8,8,7,6,5] is symmetric:
      1
     /  \
    2    2
   / \  / \
  3  4  4  3
 /\  /\ /\ /\
5 6 7 8 8 7 6 5
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.
*/

public class _101_symmetric_tree {

    public _101_symmetric_tree() {
        TreeNode r1 = new TreeNode(1);
        TreeNode r2_1 = new TreeNode(2);
        TreeNode r2_2 = new TreeNode(2);
        TreeNode r3_1 = new TreeNode(3);
        TreeNode r3_2 = new TreeNode(4);
        TreeNode r3_3 = new TreeNode(4);
        TreeNode r3_4 = new TreeNode(3);
        System.out.println(isSymmetric(r1));
    }

    private boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return false;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}