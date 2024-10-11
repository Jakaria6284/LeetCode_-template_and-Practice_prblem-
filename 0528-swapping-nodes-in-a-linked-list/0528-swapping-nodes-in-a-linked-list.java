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
    public ListNode swapNodes(ListNode head, int k) {

        ListNode dumy=head;
        int size=0;
        while(dumy!=null)
        {
            dumy=dumy.next;
            size++;
        }

        ListNode fast=head;
        ListNode last=head;

        for(int i=0;i<k-1;i++)
        {
            fast=fast.next;
        }

        for(int i=0;i<size-k;i++)
        {
           last=last.next;
        }

        int t=fast.val;
        fast.val=last.val;
        last.val=t;

        return head;

        
    }
}