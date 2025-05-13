/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode slowp = head;
        ListNode fastp = head;

        while(fastp != null && fastp.next != null)
        {
            slowp = slowp.next;
            fastp = fastp.next.next;
            if(fastp == slowp) return true;
        }
        return false;      
    }
}