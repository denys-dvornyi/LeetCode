package com.deno4ka.LeetCode.Easy;

public class _21_Merge_Two_Sorted_Lists {

    public _21_Merge_Two_Sorted_Lists() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        System.out.println(mergeTwoLists(l1, l2));
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 != null && l2 != null) {
            ListNode result = l1;
            ListNode lastNode = l1;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = l2;
            // TODO: bubble sort
            while (result.next != null) {
                if (result.val > result.next.val) {
                    ListNode tmp = new ListNode(result.next.val);
                    tmp.next = result.next.next;
                    result.val = result.next.val;
                    result.next = result.next.next;

                }
            }
            return result;
        } else if (l1 == null && l2 != null) {
            return new ListNode(l2.val);
        } else if (l2 == null && l1 != null) {
            return new ListNode(l1.val);
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