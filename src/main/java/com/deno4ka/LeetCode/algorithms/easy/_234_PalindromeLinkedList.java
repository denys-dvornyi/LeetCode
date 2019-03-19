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

import java.util.ArrayList;
import java.util.List;

public class _234_PalindromeLinkedList {

	private List<Integer> numbers;

	public _234_PalindromeLinkedList() {
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

	// (8ms/8%)
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		numbers = new ArrayList<>();
		ListNode cursor = head;
		while (cursor != null) {
			numbers.add(cursor.val);
			cursor = cursor.next;
		}
		for (int i = 0; i <= numbers.size() / 2; i++) {
			if (!numbers.get(i).equals(numbers.get(numbers.size() - 1 - i))) {
				return false;
			}
		}
		return true;
	}

	private class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}

}