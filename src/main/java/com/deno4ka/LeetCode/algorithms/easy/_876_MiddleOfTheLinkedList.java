package com.deno4ka.LeetCode.algorithms.easy;

/*
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

Constraints:
The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100
*/

import java.util.Objects;

public class _876_MiddleOfTheLinkedList {

    //	Runtime: 0 ms, faster than 100.00% & Memory Usage: 36.7 MB, less than 37.25%
    public ListNode middleNode(ListNode head) {
        int listLength = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            listLength++;
        }
        int middle = listLength / 2 + 1;
        node = head;
        for (int i = 1; i < middle; i++) {
            node = node.next;
        }
        return node;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }

    }

}
