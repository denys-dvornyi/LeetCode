package com.deno4ka.LeetCode.Easy;

/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
For example, this binary tree [1, 2,2, 3,4,4,3, 5,6,7,8,8,7,6,5] is symmetric:
        1
     /      \
    2       2
   / \     / \
  3  4    4  3
 /\  /\  /\  /\
5 6 7 8 8 7 6 5
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.

Crashed on [1,2,3,3,null,2,null]
*/

import java.util.ArrayList;

public class _101_symmetric_tree {

    public _101_symmetric_tree() {
//        [1,2,2,3,4,4,3]
//        TreeNode r1 = new TreeNode(1);
//        TreeNode r2_1 = new TreeNode(2);
//        TreeNode r2_2 = new TreeNode(2);
//        TreeNode r3_1 = new TreeNode(3);
//        TreeNode r3_2 = new TreeNode(4);
//        TreeNode r3_3 = new TreeNode(4);
//        TreeNode r3_4 = new TreeNode(3);
//        r2_1.left = r3_1;
//        r2_1.right = r3_2;
//        r2_2.left = r3_3;
//        r2_2.right = r3_4;
//        r1.left = r2_1;
//        r1.right = r2_2;

//        [1,2,3,3,null,2,null]
        TreeNode r1 = new TreeNode(1);
        TreeNode r2_1 = new TreeNode(2);
        TreeNode r2_2 = new TreeNode(3);
        TreeNode r3_1 = new TreeNode(3);
        TreeNode r3_3 = new TreeNode(2);
        r2_1.left = r3_1;
        r2_2.left = r3_3;
        r1.left = r2_1;
        r1.right = r2_2;
        System.out.println(isSymmetric(r1));
    }

    private boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        ArrayList<String> values = new ArrayList<>();
        int nesting = -1;
        getSymmetricValues(root, values, nesting);
        System.out.println(values);
        for (int i = 0; i < values.size(); i++) {
            if (!values.get(i).equals(values.get(values.size() - 1 - i))) {
                return false;
            }
        }
        return true;
    }

    private Integer getValue(TreeNode node) {
        if (node == null) return -1;
        else return node.val;
    }

    private void getSymmetricValues(TreeNode tree, ArrayList<String> values, int nesting) {
        if (tree != null) {
            getSymmetricValues(tree.left, values, ++nesting);
            values.add(String.valueOf(nesting) + String.valueOf(tree.val));
            getSymmetricValues(tree.right, values, nesting);
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}