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

//        TreeNode tn = sortedArrayToBST(new int[] {1,2,3,4,5,6,7});
//        TreeNode tn = sortedArrayToBST(new int[] {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-12,-13,-14,-15});
//        TreeNode tn = sortedArrayToBST(new int[] {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,-22,-23,-24,-25,-26,-27,-28,-29,-30,-31});
//        TreeNode tn = sortedArrayToBST(new int[] {-1,0,1,2});
//        TreeNode tn = sortedArrayToBST(new int[] {-1,0,1,2,4});
//        TreeNode tn = sortedArrayToBST(new int[] {-10,-3,0,5,9});
//        TreeNode tn = sortedArrayToBST(new int[] {0,1,2,3,4,5,6,7});
        TreeNode tn = sortedArrayToBST(new int[] {0,1,2,3,4,5,6,7,8,9});
        printTreeNode(tn);
    }

    private TreeNode sortedArrayToBST(int[] nums) {
        TreeNode result = null;
        int start, end;
        if (nums == null || nums.length == 0) return null;
        else {
            start = 0;
            end = nums.length;
        }
        if (end == 1) {
            return result = new TreeNode(nums[0]);
        } else if (end == 2) {
            result = new TreeNode(nums[1]);
            result.left = new TreeNode(nums[0]);
        } else if (end == 3) {
            result = new TreeNode(nums[1]);
            result.left = new TreeNode(nums[0]);
            result.right = new TreeNode(nums[2]);
        } else {
            int midl = end / 2;
            result = new TreeNode(nums[midl]);
            int leftMidl = (int)Math.round((double)(midl - 1 - start) / 2) + start;
            int rightMidl = (end - midl + 1) / 2 + midl;
            result.left = new TreeNode(nums[leftMidl]);
            result.right = new TreeNode(nums[rightMidl]);
            if (0 != midl - 1) {
                createTreeNode(result.left, nums, 0, midl - 1, leftMidl);
            }
            if (midl + 1 != end - 1) {
                createTreeNode(result.right, nums, midl + 1, end - 1, rightMidl);
            }
        }
        return result;
    }

    private void createTreeNode(TreeNode child, int[] nums, int start, int end, int parentPosition) {
        int length = (end - start);
        if (length == 1) {
            if (parentPosition == start) {
                child.right = new TreeNode(nums[end]);
            } else if (parentPosition == end) {
                child.left = new TreeNode(nums[start]);
            }
        } else if (length == 2) {
            child.left = new TreeNode(nums[start]);
            child.right = new TreeNode(nums[end]);
        } else if (length > 2) {
            int leftMidl = (parentPosition - start) / 2 + start;
            int rightMidl = ((end - parentPosition) / 2) + 1 + parentPosition;
            child.left = new TreeNode(nums[leftMidl]);
            child.right = new TreeNode(nums[rightMidl]);
            if (start != parentPosition - 1) {
                createTreeNode(child.left, nums, start, parentPosition - 1, leftMidl);
            }
            if (parentPosition != end - 1) {
                createTreeNode(child.right, nums, parentPosition + 1, end, rightMidl);
            }
        }
    }

    private boolean printTreeNode(TreeNode root) {
        if (root == null) return true;
        ArrayList<String> values = new ArrayList<>();
        int nesting = 0;
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

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}