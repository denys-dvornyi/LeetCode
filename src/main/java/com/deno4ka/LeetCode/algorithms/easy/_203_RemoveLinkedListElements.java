package com.deno4ka.LeetCode.algorithms.easy;

/*
Remove all elements from a linked list of integers that have value val.
Example:
Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
*/

import java.util.StringJoiner;

public class _203_RemoveLinkedListElements {

	public _203_RemoveLinkedListElements() {
//		ListNode node1 = new ListNode(1);
//		ListNode node2 = new ListNode(2);
//		ListNode node3 = new ListNode(6);
//		ListNode node4 = new ListNode(3);
//		ListNode node5 = new ListNode(4);
//		ListNode node6 = new ListNode(5);
//		ListNode node7 = new ListNode(6);
//		node1.next = node2;
//		node2.next = node3;
//		node3.next = node4;
//		node4.next = node5;
//		node5.next = node6;
//		node6.next = node7;
//		System.out.println(linkedListToString(removeElements(node1, 6))); // 1->2->3->4->5
	}

	public ListNode removeElements(ListNode head, int val) {
		ListNode filteredListNode = null;
		ListNode cursor = null;
		while (head != null) {
			if (head.val != val) {
				if (filteredListNode == null) {
					filteredListNode = new ListNode(head.val);
					filteredListNode.next = cursor;
					cursor = filteredListNode;
				} else {
					cursor.next = new ListNode(head.val);
					cursor = cursor.next;
				}
			}
			head = head.next;
		}
		return filteredListNode;
	}

	private String linkedListToString(ListNode head) {
		StringJoiner linkedListAsString = new StringJoiner("->");
		if (head != null) {
			while (head != null) {
				linkedListAsString.add(String.valueOf(head.val));
				head = head.next;
			}
		}
		if (linkedListAsString.length() == 0) {
			return "null";
		}
		return linkedListAsString.toString();
	}

	private class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}