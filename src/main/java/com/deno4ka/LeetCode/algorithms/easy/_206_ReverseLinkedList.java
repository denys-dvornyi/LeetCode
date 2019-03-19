package com.deno4ka.LeetCode.algorithms.easy;

/*
Reverse a singly linked list.

Example:
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL

Follow up:
A linked list can be reversed either iteratively or recursively. Could you implement both?
*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

public class _206_ReverseLinkedList {

	private ListNode reversedList;
	private ListNode cursor;

	public _206_ReverseLinkedList() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		System.out.println("original: " + listNodesToString(node1));
		System.out.println("reverseList: " + listNodesToString(reverseList(node1)));
	}

	// iteratively (2ms/3.65%)
//	public ListNode reverseList(ListNode head) {
//		cursor = head;
//		LinkedList<ListNode> tmpLinkedList = new LinkedList<>();
//		while (cursor != null) {
//			tmpLinkedList.add(cursor);
//			cursor = cursor.next;
//		}
//		Iterator<ListNode> iterator = tmpLinkedList.descendingIterator();
//		while (iterator.hasNext()) {
//			if (reversedList == null) {
//				cursor = new ListNode(iterator.next().val);
//				reversedList = cursor;
//			} else {
//				cursor.next = new ListNode(iterator.next().val);
//				cursor = cursor.next;
//			}
//		}
//		return reversedList;
//	}

	// recursively (0ms/100%)
	public ListNode reverseList(ListNode head) {
		if (head != null) {
			reverseList(head.next);
		}
		if (head != null) {
			if (reversedList == null) {
				cursor = new ListNode(head.val);
				reversedList = cursor;
			} else {
				cursor.next = new ListNode(head.val);;
				cursor = cursor.next;
			}
		}
		return reversedList;
	}

	private String listNodesToString(ListNode head) {
		StringJoiner listNodesAsString = new StringJoiner("->");
		ListNode currentNode = head;
		while (currentNode != null) {
			listNodesAsString.add(String.valueOf(currentNode.val));
			currentNode = currentNode.next;
		}
		listNodesAsString.add("NULL");
		return listNodesAsString.toString();
	}

    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
        	val = x;
        }

	    @Override
	    public String toString() {
		    return String.valueOf(val);
	    }
    }

}