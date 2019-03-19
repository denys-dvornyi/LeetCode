package com.deno4ka.LeetCode.algorithms.easy;

// Given a sorted linked list, delete all duplicates such that each element appear only once.
// For example,
// Given 1->1->2, return 1->2.
// Given 1->1->2->3->3, return 1->2->3.

public class _83_RemoveDuplicatesFromSortedList {

    public _83_RemoveDuplicatesFromSortedList() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(1);
        ListNode ln3 = new ListNode(2);
        ListNode ln4 = new ListNode(2);
        ListNode ln5 = new ListNode(2);
        ListNode ln6 = new ListNode(3);
        ListNode ln7 = new ListNode(3);
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;
        ln5.next = ln6;
        ln6.next = ln7;
        printListNodes(ln1);
        deleteDuplicates(ln1);
        printListNodes(ln1);
    }

    private ListNode deleteDuplicates(ListNode head) {
        if (head != null) {
            int prevValue = head.val;
            ListNode prevNode = head;
            ListNode nextNode = head.next;
            while (nextNode != null) {
                if (prevValue != nextNode.val) {
                    prevNode.next = nextNode;
                    prevNode = nextNode;
                    prevValue = nextNode.val;
                }
                nextNode = nextNode.next;
            }
            prevNode.next = null;
        }
        return head;
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
        System.out.println();
    }

}