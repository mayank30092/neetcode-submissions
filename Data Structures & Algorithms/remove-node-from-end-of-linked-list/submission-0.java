/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = head;
        int count = 0;

        while (prev != null) {
            prev = prev.next;
            count++;
        }

        int nFromStart = count - n;
        if (nFromStart == 0) return head.next;

        prev = head;
        int i = 0;

        while (i < nFromStart - 1) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
    }
}

