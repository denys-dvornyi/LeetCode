package com.deno4ka.LeetCode.algorithms.easy;

/*
Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
For example, given a 3-ary tree:
We should return its level order traversal:
[
	[1],
	[3,2,4],
	[5,6]
]

Note:
The depth of the tree is at most 1000.
The total number of nodes is at most 5000.
*/

import java.util.ArrayList;
import java.util.List;

public class _429_NAryTreeLevelOrderTraversal {

    public _429_NAryTreeLevelOrderTraversal() {
//		System.out.println(levelOrder(null)); // []

//		Node grandChildLeft = new Node(5, new ArrayList<>());
//		Node grandChildRight = new Node(6, new ArrayList<>());
//		List<Node> grandChildren = new ArrayList<>();
//		grandChildren.add(grandChildLeft);
//		grandChildren.add(grandChildRight);
//		Node childLeft = new Node(3, grandChildren);
//		Node childMidl = new Node(2, new ArrayList<>());
//		Node childRight = new Node(4, new ArrayList<>());
//		List<Node> children = new ArrayList<>();
//		children.add(childLeft);
//		children.add(childMidl);
//		children.add(childRight);
//		Node root = new Node(1, children);
//		System.out.println(levelOrder(root)); // [[1],[3,2,4],[5,6]]

        Node grandChildLeft = new Node(6, new ArrayList<>());
        List<Node> grandChildrenLeft = new ArrayList<>();
        grandChildrenLeft.add(grandChildLeft);
        Node childLeft = new Node(3, grandChildrenLeft);

        Node grandChildRight0 = new Node(0, new ArrayList<>());
        Node grandChildRight5 = new Node(5, new ArrayList<>());
        List<Node> grandChildrenRight = new ArrayList<>();
        grandChildrenRight.add(grandChildRight0);
        grandChildrenRight.add(grandChildRight5);
        Node childRight = new Node(10, grandChildrenRight);

        List<Node> children = new ArrayList<>();
        children.add(childLeft);
        children.add(childRight);
        Node root = new Node(1, children);
//		System.out.println(root);
        System.out.println(levelOrder(root)); // [[1],[10,3],[5,0,6]]
    }

    // (4ms/96.46%)
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> levelOrder = new ArrayList<>();
        if (root != null) {
            List<Integer> level = new ArrayList<>();
            level.add(root.val);
            levelOrder.add(level);
            addChildren(root.children, levelOrder, 1);
        }
        return levelOrder;
    }

    private void addChildren(List<Node> children, List<List<Integer>> levelOrder, int depth) {
        if (children != null && !children.isEmpty()) {
            List<Integer> childLevel;
            if (depth >= levelOrder.size()) {
                childLevel = new ArrayList<>();
                levelOrder.add(childLevel);
            } else {
                childLevel = levelOrder.get(depth);
                if (childLevel == null) {
                    childLevel = new ArrayList<>();
                }
            }
            for (Node n : children) {
                childLevel.add(n.val);
                addChildren(n.children, levelOrder, depth + 1);
            }
        }
    }

    private class Node {
        int val;
        List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }

        @Override
        public String toString() {
            return "{" +
                    "\"val\":" + val +
                    ", \"children\":" + children +
                    '}';
        }
    }

}