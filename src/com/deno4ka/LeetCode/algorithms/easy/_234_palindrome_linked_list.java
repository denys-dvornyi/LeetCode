package com.deno4ka.LeetCode.algorithms.easy;

/*
Given a singly linked list, determine if it is a palindrome.

Example 1:
Input: 1->2
Output: false

Example 2:
Input: 1->2->2->1
Output: true

Follow up:
Could you do it in O(n) time and O(1) space?
*/

public class _234_palindrome_linked_list {

	public _234_palindrome_linked_list() {
		ListNode head = new ListNode(1);
		ListNode node_1 = new ListNode(2);
		head.next = node_1;
		System.out.println(isPalindrome(head)); // false

		head = new ListNode(1);
		node_1 = new ListNode(2);
		ListNode node_2 = new ListNode(2);
		ListNode node_3 = new ListNode(1);
		head.next = node_1;
		node_1.next = node_2;
		node_2.next = node_3;
		System.out.println(isPalindrome(head)); // true
	}

	public boolean isPalindrome(ListNode head) {
		if (head != null) {
			return true;
		}
		return false;
	}

	private class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}

}