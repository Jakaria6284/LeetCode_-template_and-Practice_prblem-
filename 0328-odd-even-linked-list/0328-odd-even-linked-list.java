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
    public ListNode oddEvenList(ListNode head) {

        if(head==null || head.next==null)
        {
            return head;
        }

        ListNode slow=head.next;;
        ListNode fast=head;
        ListNode slowHead=head.next;

       

        while(slow!=null && slow.next!=null)
        {
           fast.next=fast.next.next;
           fast=fast.next;

           slow.next=slow.next.next;
           slow=slow.next;
        }

       fast.next=slowHead;


       return head;
        
    }
}