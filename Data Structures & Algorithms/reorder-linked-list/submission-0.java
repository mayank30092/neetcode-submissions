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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;

        //1.find mid
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //2.Reverse 2nd half
        ListNode curr = slow.next;
        slow.next = null;
        ListNode next;
        ListNode prev = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode head1 = head;
        ListNode head2 = prev;

        //3. Merge both
        while(head2!=null){
            ListNode next1 = head1.next;
            ListNode next2 = head2.next;

            head1.next = head2;
            head2.next = next1;

            head1 = next1;
            head2 = next2;
        }
    }
}
