package com.deno4ka.LeetCode.Easy;

/*
Given a linked list, determine if it has a cycle in it.
Follow up:
Can you solve it without using extra space?
*/

import java.util.ArrayList;
import java.util.List;

public class _141_linked_list_cycle {

    public _141_linked_list_cycle() {
        ListNode tail = new ListNode(999);
        ListNode l2 = new ListNode(2);
        l2.next = tail;
        ListNode l1 = new ListNode(1);
        l1.next = l2;
        ListNode head = new ListNode(0);
        head.next = l1;
        tail.next = l1;

        hasCycle(head);
    }

    public boolean hasCycle(ListNode head) {
        List<ListNode> listNodeMap = new ArrayList<>();
        if (head == null) {
            return false;
        } else {
            do {
                if (listNodeMap.contains(head)) {
                    return true;
                }
                listNodeMap.add(head);
                head = head.next;
            }
            while (head != null);
        }
        return false;
    }

//    Definition for singly-linked list.
    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}