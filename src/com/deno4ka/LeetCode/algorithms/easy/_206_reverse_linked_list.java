package com.deno4ka.LeetCode.algorithms.easy;

/*
Reverse a singly linked list.

Example:
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
*/

public class _206_reverse_linked_list {

	public _206_reverse_linked_list() {

	}

	public ListNode reverseList(ListNode head) {
		return head;
	}

    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
        	val = x;
        }
    }

}