package com.deno4ka.LeetCode.Easy;

// Given a sorted linked list, delete all duplicates such that each element appear only once.
// For example,
// Given 1->1->2, return 1->2.
// Given 1->1->2->3->3, return 1->2->3.

public class _83_remove_duplicates_from_sorted_list {

    public _83_remove_duplicates_from_sorted_list() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(1);
        ListNode ln3 = new ListNode(2);
        ListNode ln4 = new ListNode(3);
        ListNode ln5 = new ListNode(3);
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;
        printListNodes(ln1);
//        System.out.println(deleteDuplicates(ln1));
    }

    public ListNode deleteDuplicates(ListNode head) {
        return null;
    }

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    private void printListNodes(ListNode ln) {
        ListNode currentNode = ln;
        while (currentNode.next != null) {
            System.out.print(currentNode.val);
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.val);
    }
}