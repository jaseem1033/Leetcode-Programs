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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode head1 = head;
        if(head == null) return head;
        while(head1.next != null)
        {
            if(head1.val == head1.next.val)
                head1.next = head1.next.next;
            else
                head1 = head1.next;
        }
        return head;
    }
}