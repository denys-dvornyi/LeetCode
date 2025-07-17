package com.deno4ka.LeetCode.algorithms.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * <p>
 * For example, the following two linked lists:
 * <p>
 * A:       a1 → a2
 * ↘
 * c1 → c2 → c3
 * ↗
 * B: b1 → b2 → b3
 * <p>
 * begin to intersect at node c1.
 * <p>
 * Notes:
 * <p>
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 */

public class _160_IntersectionOfTwoLinkedLists {

//	public _160_IntersectionOfTwoLinkedLists() {
//		ListNode headA = new ListNode(1);
//		ListNode L3 = new ListNode(3);
//		ListNode L5 = new ListNode(5);
//		ListNode L7 = new ListNode(7);
//		ListNode L9 = new ListNode(9);
//		ListNode L11 = new ListNode(11);
//		ListNode L13 = new ListNode(13);
//		ListNode L15 = new ListNode(15);
//		ListNode L17 = new ListNode(17);
//		ListNode L19 = new ListNode(19);
//		ListNode L21 = new ListNode(21);
//		headA.next = L3;
//		L3.next = L5;
//		L5.next = L7;
//		L7.next = L9;
//		L9.next = L11;
//		L11.next = L13;
//		L13.next = L15;
//		L15.next = L17;
//		L17.next = L19;
//		L19.next = L21;
//
//		ListNode headB = new ListNode(2);
//
//		ListNode result = getIntersectionNode(headA, headB);
//		System.out.println(result);
//	}

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        } else {
            Set<ListNode> headSet = new HashSet<>();
            ListNode cursorA = headA;
            ListNode cursorB = headB;
            while (cursorA != null || cursorB != null) {
                boolean added;
                if (cursorA != null) {
                    added = headSet.add(cursorA);
                    if (!added) {
                        return cursorA;
                    }
                    cursorA = cursorA.next;
                }
                if (cursorB != null) {
                    added = headSet.add(cursorB);
                    if (!added) {
                        return cursorB;
                    }
                    cursorB = cursorB.next;
                }
            }
            return null;
        }
    }

    // BEST answer from leetcode.com
//	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//		int len1 = 0, len2 = 0;
//		ListNode n1 = headA, n2 = headB;
//		while(n1 != null) {
//			n1 = n1.next;
//			len1++;
//		}
//		while(n2 != null) {
//			n2 = n2.next;
//			len2++;
//		}
//		n1 = headA;
//		n2 = headB;
//		while (len1 > len2) {
//			n1 = n1.next;
//			len1--;
//		}
//		while(len2 > len1) {
//			n2 = n2.next;
//			len2--;
//		}
//		while(n1 != n2) {
//			n1 = n1.next;
//			n2 = n2.next;
//		}
//		return n2;
//	}

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}