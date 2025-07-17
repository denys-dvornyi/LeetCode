package com.deno4ka.LeetCode.algorithms.easy;

/*
Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
Given linked list -- head = [4,5,1,9], which looks like following:

    4 -> 5 -> 1 -> 9

Example 1:
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.

Example 2:
Input: head = [4,5,1,9], node = 1
Output: [4,5,9]
Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.

Note:
The linked list will have at least two elements.
All of the nodes' values will be unique.
The given node will not be the tail and it will always be a valid node of the linked list.
Do not return anything from your function.
*/

import java.util.StringJoiner;

public class _237_DeleteNodeInALinkedList {

    public _237_DeleteNodeInALinkedList() {
        ListNode node_1 = new ListNode(4);
        ListNode node_2 = new ListNode(5);
        ListNode node_3 = new ListNode(1);
        ListNode node_4 = new ListNode(9);
        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;

        StringJoiner listNodeAsString = new StringJoiner("->");
        listNodeToString(node_1, listNodeAsString);
        System.out.println(listNodeAsString);

        deleteNode(node_3);

        listNodeAsString = new StringJoiner("->");
        listNodeToString(node_1, listNodeAsString);
        System.out.println(listNodeAsString);
    }

    // (0ms/100%)
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    private void listNodeToString(ListNode node, StringJoiner listNodeAsString) {
        if (node != null) {
            listNodeAsString.add(String.valueOf(node.val));
            listNodeToString(node.next, listNodeAsString);
        }
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}