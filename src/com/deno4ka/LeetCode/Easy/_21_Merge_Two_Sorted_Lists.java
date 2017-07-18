package com.deno4ka.LeetCode.Easy;

import java.util.ArrayList;

// Merge two sorted linked lists and return it as a new list.
// The new list should be made by splicing together the nodes of the first two lists.

public class _21_Merge_Two_Sorted_Lists {

    public _21_Merge_Two_Sorted_Lists() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(0);
//        l2.next = new ListNode(2);
//        l2.next.next = new ListNode(4);
        System.out.println(mergeTwoLists(l1, l2));
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 != null && l2 != null) {
            ArrayList<Integer> tmp = new ArrayList<>();
            int counter = 0;
            while (l1 != null) {
                tmp.add(counter++, l1.val);
                l1 = l1.next;
            }
            while (l2 != null) {
                tmp.add(counter++, l2.val);
                l2 = l2.next;
            }
//            System.out.println("before: " + tmp);
            for (int i = 0; i < tmp.size(); i++) {
                for (int j = tmp.size() - 1; j > i; j--) {
                    if (tmp.get(j) < tmp.get(j - 1)) {
                        int t = tmp.get(j);
                        tmp.set(j, tmp.get(j - 1));
                        tmp.set(j - 1, t);
                    }
                }
            }
//            System.out.println("after: " + tmp);
            ListNode result = null;
            ListNode current = null;
            for (int k = 0; k < tmp.size() - 1; k++) {
                if (result == null) {
                    result = new ListNode(tmp.get(k));
                    current = new ListNode(tmp.get(k + 1));
                    result.next = current;
                } else {
                    ListNode t = new ListNode(tmp.get(k + 1));
                    current.next = t;
                    current = t;
                }
            }
            return result;
        } else if (l1 == null && l2 != null) {
            return l2;
        } else if (l1 != null && l2 == null) {
            return l1;
        } else {
            return null;
        }
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[").append(val);
            ListNode nextNode = next;
            while (nextNode != null) {
                sb.append(",");
                sb.append(nextNode.val);
                nextNode = nextNode.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }

}