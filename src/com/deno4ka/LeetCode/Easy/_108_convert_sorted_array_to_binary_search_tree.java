package com.deno4ka.LeetCode.Easy;

/*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST
*/

import java.util.ArrayList;

public class _108_convert_sorted_array_to_binary_search_tree {

    public _108_convert_sorted_array_to_binary_search_tree() {
//        TreeNode p = new TreeNode(0);
//        TreeNode p1 = new TreeNode(1);
//        TreeNode p2 = new TreeNode(2);
//        TreeNode p3 = new TreeNode(3);
//        TreeNode p4 = new TreeNode(4);
//        p1.left = p3;
//        p1.right = p4;
//        p.left = p1;
//        p.right = p2;
//        printTreeNode(p);

        TreeNode tn1 = sortedArrayToBST(new int[] {1,2,3,4,5,6,7});
        printTreeNode(tn1);
    }

    private TreeNode sortedArrayToBST(int[] nums) {
        TreeNode result = null;
        if (nums == null || nums.length == 0) return null;
        else result = new TreeNode(0);
        createTreeNode(result, nums, 0, nums.length - 1);
        return result;
    }

    private void createTreeNode(TreeNode child, int[] nums, int start, int end) {
        int length = end - start;
        if (length == 0) {
            child = null;
        } else if (length == 1) {
            child = new TreeNode(nums[end]);
        } else if (length == 2) {
            child = new TreeNode(nums[end]);
            child.left = new TreeNode(nums[start]);
        } else if (length == 3) {
            child = new TreeNode(nums[(end - start) / 2]);
            child.left = new TreeNode(nums[start]);
            child.right = new TreeNode(nums[end]);
        } else {
            int midl = (end - start) / 2;
            child = new TreeNode(nums[midl]);
            createTreeNode(child.left, nums, start, midl - 1);
            createTreeNode(child.right, nums, midl + 1, end);
        }
    }

    private boolean printTreeNode(TreeNode root) {
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

    private void getSymmetricValues(TreeNode tree, ArrayList<String> values, int nesting) {
        if (tree != null) {
            getSymmetricValues(tree.left, values, ++nesting);
            values.add(String.valueOf(nesting) + String.valueOf(tree.val));
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