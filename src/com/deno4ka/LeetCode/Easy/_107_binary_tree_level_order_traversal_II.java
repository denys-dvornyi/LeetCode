package com.deno4ka.LeetCode.Easy;

/*
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
*/

import java.util.ArrayList;
import java.util.List;

public class _107_binary_tree_level_order_traversal_II {

    public _107_binary_tree_level_order_traversal_II() {
//        [1,2,3,3,null,2,null]
        TreeNode r1 = new TreeNode(3);
        TreeNode r2_1 = new TreeNode(9);
        TreeNode r2_2 = new TreeNode(20);
        TreeNode r3_3 = new TreeNode(15);
        TreeNode r3_4 = new TreeNode(7);
        r2_2.left = r3_3;
        r2_2.right = r3_4;
        r1.left = r2_1;
        r1.right = r2_2;
        System.out.println(levelOrderBottom(r1));
    }

    private List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        ArrayList<String> values = new ArrayList<>();
        int nesting = -1;
        getSymmetricValues(root, values, nesting);
//        System.out.println(values);
        int max = 0;
        for (String val : values) {
            String[] valParts = val.split(":");
            int value = Integer.parseInt(valParts[0]);
            if (max < value) {
                max = value;
            }
        }
        int listSize = max;
        for(int i = 0; i <= listSize; i++) {
            List<Integer> vals = new ArrayList<>();
            for(int j = 0; j < values.size(); j++) {
                String[] valParts = values.get(j).split(":");
                int value = Integer.parseInt(valParts[0]);
                if (value == max) {
                    vals.add(Integer.parseInt(valParts[1]));
                }
            }
            max--;
            result.add(vals);
        }
        return result;
    }

    private void getSymmetricValues(TreeNode tree, ArrayList<String> values, int nesting) {
        if (tree != null) {
            getSymmetricValues(tree.left, values, ++nesting);
            values.add(String.valueOf(nesting) + ":" + String.valueOf(tree.val));
            getSymmetricValues(tree.right, values, nesting);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}